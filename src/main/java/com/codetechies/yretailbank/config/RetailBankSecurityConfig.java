package com.codetechies.yretailbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class RetailBankSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests().requestMatchers("/customer/getBalance/*").authenticated()
                .requestMatchers("/helpDesk/contactUs").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();

        return (SecurityFilterChain)http.build();
    }
}
