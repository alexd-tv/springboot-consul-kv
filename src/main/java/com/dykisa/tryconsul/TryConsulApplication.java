package com.dykisa.tryconsul;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
@EnableConfigurationProperties(App2Config.class)
public class TryConsulApplication {

    @Autowired
    private App2Config app2Config;
    @Autowired
    private IdentConfig identConfig;

    @RequestMapping("/")
    public String home() {
        LoggerFactory.getLogger(getClass()).info("getEmail: {}", app2Config.getEmail());
        LoggerFactory.getLogger(getClass()).info("getBaseUrl: {}", app2Config.getBaseUrl());
        LoggerFactory.getLogger(getClass()).info("getName: {}", identConfig.getName());
        LoggerFactory.getLogger(getClass()).info("getClearName: {}", identConfig.getClearName());
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(TryConsulApplication.class, args);
    }

}
