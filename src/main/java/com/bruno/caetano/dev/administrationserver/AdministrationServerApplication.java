package com.bruno.caetano.dev.administrationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdministrationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministrationServerApplication.class, args);
    }

}
