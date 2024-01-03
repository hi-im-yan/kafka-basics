FROM openjdk:17-jdk-slim

COPY target/producer-*.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]