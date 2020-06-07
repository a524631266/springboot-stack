package com.springboot.stack.mybatisplay.mapper;

import com.springboot.stack.mybatisplay.model.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
@CacheNamespace
public interface UserMapper {

    @Select("select * from user where id= #{id}")
    User insertUser(int id);
}
