FROM openjdk:21
COPY ./target/finalcoding.jar finalcoding.jar
CMD ["java","-jar","finalcoding.jar"]
