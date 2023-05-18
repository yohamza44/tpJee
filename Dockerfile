FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/student-management-system-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
ENTRYPOINT [ "java","-jar","/app.jar" ]