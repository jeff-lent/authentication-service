FROM openjdk:17
LABEL developer="Hunain Parekh | Nabeel Ahmed | Samara Mohsin"
ADD ./target/authentication-service.jar authentication-service.jar
ENTRYPOINT ["java","-jar","authentication-service.jar"]