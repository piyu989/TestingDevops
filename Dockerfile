FROM openjdk:17
EXPOSE 8081
ADD target/Mainjar.jar Mainjar.jar
ENTRYPOINT["java","-jar","Mainjar.jar "]