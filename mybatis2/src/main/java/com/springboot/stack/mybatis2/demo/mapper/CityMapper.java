package com.springboot.stack.mybatis2.demo.mapper;

import com.springboot.stack.mybatis2.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {
    @Select("select * from CITY where id =#{id}")
    City findCityById(int id);

    @Select("select * from CITY where id =#{param1} and state=#{param2}")
    City findCityByIdAndState(int id,String state);


    @Select("select * from CITY where id =#{arg0} and state=#{param2}")
    City findCityByIdAndState2(int id,String state);

    @Select("select * from CITY where id =#{arg0} and state=#{param2}")
    City findCityByIdAndState3(int id,String state,String name);

    @Select("select * from CITY where state =#{state}")
    List<City> findCityByState(@Param("state") String state);
}
