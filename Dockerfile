FROM java:8
EXPOSE 8082

COPY product-service.jar .
ENTRYPOINT ["java","-jar","product-service.jar"]