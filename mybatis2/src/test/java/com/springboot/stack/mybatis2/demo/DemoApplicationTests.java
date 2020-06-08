package com.springboot.stack.mybatis2.demo;

import com.springboot.stack.mybatis2.demo.domain.City;
import com.springboot.stack.mybatis2.demo.mapper.CityMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private CityMapper cityMapper;
    @Test
    void contextLoads() {
        City cityById = cityMapper.findCityById(1);
        System.out.println(cityById);
        List<City> ca = cityMapper.findCityByState("CA");
        System.out.println(ca);
    }

}
