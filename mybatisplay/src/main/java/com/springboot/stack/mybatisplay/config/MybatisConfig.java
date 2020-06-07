package com.springboot.stack.mybatisplay.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {
    @Bean
    public SqlSessionFactory setupSqlSessionFactory(){
        SqlSessionFactoryBean

    }
}
