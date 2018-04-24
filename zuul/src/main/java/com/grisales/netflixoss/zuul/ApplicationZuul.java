package com.grisales.netflixoss.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

/**
 * Created by grisales on 4/23/18.
 */
@SpringBootApplication
@Controller
@EnableZuulProxy
public class ApplicationZuul {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationZuul.class).web(true).run(args);
    }
}
