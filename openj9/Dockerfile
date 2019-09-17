FROM adoptopenjdk:11-jre-openj9
EXPOSE 8081
RUN mkdir /opt/app
COPY ./target/openj9-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java","-jar","/opt/app/openj9-0.0.1-SNAPSHOT.jar"]

