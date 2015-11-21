FROM williamyeh/java8
MAINTAINER Ajay
COPY build/libs/user-service-1.0.jar /
ENTRYPOINT ["java", "-jar", "user-service-1.0.jar"]
