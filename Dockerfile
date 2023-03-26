FROM amazoncorretto:8-alpine3.15-jdk
MAINTAINER GJM
COPY target/gjm-0.0.1-SNAPSHOT.jar  gjm-app.jar
ENTRYPOINT ["java","-jar","/gjm-app.jar"]