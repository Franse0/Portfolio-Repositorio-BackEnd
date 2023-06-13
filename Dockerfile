
FROM amazoncorretto:17-apline-jdk 
COPY targer/api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT  ["java","-jar","/app.jar"]
