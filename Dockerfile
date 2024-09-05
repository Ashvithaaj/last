FROM openjdk:21
COPY ./target/finalcoding.finalcoding.jar
CMD ["java","-jar","finalcoding.jar"]
