FROM amazoncorretto:11-alpine-jdk
MAINTAINER GJM
COPY target/gjm-0.0.1-SNAPSHOT.jar  gjm-app.jar
ENTRYPOINT ["java","-jar","/gjm-app.jar"]