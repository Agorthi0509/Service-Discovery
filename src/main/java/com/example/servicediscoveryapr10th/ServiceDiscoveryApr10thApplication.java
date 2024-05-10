package com.example.servicediscoveryapr10th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryApr10thApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryApr10thApplication.class, args);
    }

}
