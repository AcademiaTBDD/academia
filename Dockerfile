FROM maven:3.8.4-jdk-11 as builds
WORKDIR /app
COPY / /app
RUN mvn install -DskipTests

FROM maven:3.8.4-jdk-11
WORKDIR /app
COPY --from=builds /app/target/academia-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]
