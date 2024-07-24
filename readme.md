# Spring Boot + OpenAPI Generator + RestClient demo

This project is a sample app to showcase how to generate HTTP clients from OpenAPI spec in a Spring Boot application.

More details in a blog post: [maciejwalkowiak.com/blog/spring-boot-openapi-generate-client/](https://maciejwalkowiak.com/blog/spring-boot-openapi-generate-client/)

The `petclinic-spec.yml` is copied from [spring-petclinic/spring-petclinic-rest](https://github.com/spring-petclinic/spring-petclinic-rest/blob/master/src/main/resources/openapi.yml) project and updated with security configuration.

To run example end to end, clone [spring-petclinic-rest](https://github.com/spring-petclinic/spring-petclinic-rest/blob/master/src/main/resources/openapi.yml), set `petclinic.security.enable=true` in `application.properties` and run it with `./mvnw spring-boot:run`. Then run the sample that generates the client code.
