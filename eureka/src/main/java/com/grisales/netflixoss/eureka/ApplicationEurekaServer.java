package com.grisales.netflixoss.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by grisales on 4/23/18.
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationEurekaServer.class, args);
    }
}
