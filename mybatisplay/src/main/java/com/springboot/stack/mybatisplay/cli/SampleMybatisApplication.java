package com.springboot.stack.mybatisplay.cli;

import com.springboot.stack.mybatisplay.mapper.CityMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleMybatisApplication implements CommandLineRunner {
    private final SqlSession sqlSession;
    private final CityMapper cityMapper;

    public SampleMybatisApplication(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
        cityMapper = sqlSession.getMapper(CityMapper.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleMybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }

}