FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
COPY target/tpAchatProject-1.0.jar tpAchatProject-1.0.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/tpAchatProject-1.0.jar"]