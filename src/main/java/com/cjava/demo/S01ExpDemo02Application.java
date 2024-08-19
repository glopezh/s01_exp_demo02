package com.cjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S01ExpDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(S01ExpDemo02Application.class, args);
    }

}
