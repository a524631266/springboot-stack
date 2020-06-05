package com.springboot.stack.websecuritydemo.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        // 放行所有网页
        http.authorizeRequests()
                .antMatchers("/login.html","/login","/wxlogin").permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll();
//        super.configure(http);
    }
}
