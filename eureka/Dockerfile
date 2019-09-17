FROM adoptopenjdk:11-jre-openj9
EXPOSE 8761
RUN mkdir /opt/app
COPY ./target/eureka-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-Xms16m","-Xmx32m","-XX:MaxMetaspaceSize=48m","-XX:CompressedClassSpaceSize=8m","-Xss256k","-Xmn8m","-XX:ReservedCodeCacheSize=8m","-XX:InitialCodeCacheSize=4m","-XX:MaxDirectMemorySize=16m","-jar","/opt/app/eureka-0.0.1-SNAPSHOT.jar"]

