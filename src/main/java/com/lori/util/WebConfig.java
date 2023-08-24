package com.lori.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    // cross origin
    @Override
    public void addCorsMappings(CorsRegistry registry) {
                // all urls allow cross origin
        registry.addMapping("/**")
                // allow cross origin from
                .allowedOrigins("http://localhost:5173","null")
                // allow methods
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE")
                // allow credentials/token
                .allowCredentials(true)
                // max respond time
                .maxAge(3600);
    }
}
