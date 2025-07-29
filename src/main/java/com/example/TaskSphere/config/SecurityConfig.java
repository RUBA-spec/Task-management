// Create a file: SecurityConfig.java inside com.example.TaskSphere.config

package com.example.TaskSphere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF (for Postman testing)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Allow all requests without login
                );
        return http.build();
    }
}
