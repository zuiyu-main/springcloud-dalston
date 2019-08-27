package com.tz.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class Client1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                Client1Application.class)
                .web(true).run(args);
//        SpringApplication.run(Client1Application.class, args);
    }

}
