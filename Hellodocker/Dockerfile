FROM alpine:latest
WORKDIR /
VOLUME /tmp
ADD hello-docker.jar hello-docker.jar
RUN apk --update add openjdk11-jre
EXPOSE 8080
CMD java -jar hello-docker.jar
