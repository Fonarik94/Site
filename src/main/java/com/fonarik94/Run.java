package com.fonarik94;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableCaching
@EnableHypermediaSupport(type = {EnableHypermediaSupport.HypermediaType.HAL})
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}