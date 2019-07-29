package com.lyn0801.springboot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // basic proxy
                .route("client_route", r -> r.path("/hello/**").and()
                        .header("X-Marstor-Token", "c9494352f924f36974ebb48261570ec7")
                        .uri("lb://eureka-client"))
                .build();
    }
}
