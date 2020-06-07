package com.springboot.stack.websecuritydemo.demo.mapper;

import com.springboot.stack.websecuritydemo.demo.model.Admin;
import org.springframework.stereotype.Repository;

/**
 * 这里假设哟个mapper方法
 */
@Repository
public class AdminRepository {
    /**
     * 根据手机号码获取用户信息
     * @param phone
     * @return
     */
    public Admin getAdmin(String phone){
        // TODO
        return new Admin("zhangll","123456", "123456789");
    };

}
