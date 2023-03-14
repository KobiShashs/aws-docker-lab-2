# Build stage
FROM maven:3.8-jdk-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src/ /app/src/
RUN mvn package -DskipTests

# Runner stage
FROM openjdk:17-jdk-alpine AS runner
WORKDIR /app
COPY --from=builder /app/target/myapp.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]