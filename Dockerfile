FROM amazoncorretto:17-alpine-jdk
COPY targer/api-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","/app.jar"]
