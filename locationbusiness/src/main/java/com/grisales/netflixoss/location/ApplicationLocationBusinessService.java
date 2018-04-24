package com.grisales.netflixoss.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by grisales on 4/24/18.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationLocationBusinessService {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLocationBusinessService.class, args);
    }
}
