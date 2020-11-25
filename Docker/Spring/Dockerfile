FROM openjdk:11
ADD target/regalia.jar regalia.jar
EXPOSE 8443
ENTRYPOINT ["java", "-jar", "regalia.jar"]