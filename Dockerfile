FROM openjdk:21
WORKDIR /var/lib/jenkins/workspace/jars
ADD target/springboot-conf-config-server-0.0.1-SNAPSHOT.jar springboot-conf-config-server.jar
COPY target/springboot-conf-config-server-0.0.1-SNAPSHOT.jar springboot-conf-config-server-0.0.1-SNAPSHOT.jar
EXPOSE 8762
ENTRYPOINT ["java", "-jar", "springboot-conf-config-server-0.0.1-SNAPSHOT.jar"]