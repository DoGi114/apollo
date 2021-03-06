package com.damiannguyen.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Value("${domain}") private String domain;
    @Value("${email}") private String email;
    @Value("${user}") private String user;
    @Value("${theme}") private String theme;

    public ApplicationConfigDto asDto(){
        return new ApplicationConfigDto()
                .setDomain(domain)
                .setEmail(email)
                .setTheme(theme)
                .setUser(user);
    }

    public String getDomain() {
        return domain;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getTheme() {
        return theme;
    }
}
