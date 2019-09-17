FROM openjdk:8-jdk-alpine
EXPOSE 8082
RUN mkdir /opt/app
COPY ./target/openjdk-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java","-jar","/opt/app/openjdk-0.0.1-SNAPSHOT.jar"]

