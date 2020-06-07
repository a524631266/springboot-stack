package com.springboot.stack.websecuritydemo.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncodingConfig {
    @Bean("localPassEncoder")
    @Primary
    public PasswordEncoder setPasswordEncoder(){

        PasswordEncoder delegatingPasswordEncoder =
                PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return delegatingPasswordEncoder;
    }
}
