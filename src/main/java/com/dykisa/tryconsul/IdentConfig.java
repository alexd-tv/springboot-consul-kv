package com.dykisa.tryconsul;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@ConfigurationProperties("identifier")
@Configuration
public class IdentConfig {
    private String name;
    private String clearName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClearName() {
        return clearName;
    }

    public void setClearName(String clearName) {
        this.clearName = clearName;
    }
}
