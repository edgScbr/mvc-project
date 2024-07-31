FROM openjdk:21-jdk

ARG JAR_FILE=target/*.jar

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY ./target/mvc-project-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
