package com.nlx.appliaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableConfigurationProperties
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class Appliaction
{
    public static void main(String[] args)
    {
        SpringApplication.run(Appliaction.class, args);
    }
}
