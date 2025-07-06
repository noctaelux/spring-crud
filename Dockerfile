FROM docker.io/library/openjdk:21

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /usr/local/bin/java-app/app.jar
ENTRYPOINT ["java","-jar","/usr/local/bin/java-app/app.jar"]