FROM amazoncorretto:11-al2023-jdk
MAINTAINER nobledigitalservices.com
COPY target/*.jar *.jar
ENTRYPOINT ["java","-jar","/*.jar"]