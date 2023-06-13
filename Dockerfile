FROM amazoncorretto:17-alpine-jdk

copy target/api-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","/app.jar"]