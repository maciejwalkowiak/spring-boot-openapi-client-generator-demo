package com.example.openapidemo;

import com.myapp.ApiClient;
import com.myapp.api.PetApi;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class OpenApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenApiDemoApplication.class, args);
    }

    @Bean
    ApiClient apiClient(RestClient.Builder builder) {
        var apiClient = new ApiClient(builder.build());
        apiClient.setUsername("admin");
        apiClient.setPassword("admin");
        apiClient.setBasePath("http://localhost:9966/petclinic/api");
        return apiClient;
    }

    @Bean
    PetApi petApi(ApiClient apiClient) {
        return new PetApi(apiClient);
    }

    @Bean
    ApplicationRunner applicationRunner(PetApi petApi) {
        return args -> {
            System.out.println(petApi.listPets());
        };
    }
}
