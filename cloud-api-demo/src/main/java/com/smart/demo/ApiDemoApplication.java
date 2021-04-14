package com.smart.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApiDemoApplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);

    }


}
