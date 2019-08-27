package com.tz.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ConsulApplication {
    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }

}
