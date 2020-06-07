package com.springboot.stack.websecuritydemo.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestPasswordService {
    @Resource(name = "passwordService")
    private PasswordEncodingService passwordEncodingService;

    /**
     * 验证密码是否正确
     */
    @Test
    public void testPasswordEncoding(){
        String encode = passwordEncodingService.encode("123456");
        // {bcrypt}$2a$10$rD/.Q/l1b17QeMsIvOSIZ.5L3bBY0uYh39tadqcyZUPIuvHwZ1362
        // {bcrypt}$2a$10$a5Fn/o6hGsf1TPRN4Fn0peulGE2Yx/Ayti8tgAuMg1fASqV37Dr3q
        System.out.println(encode);
        boolean matches = passwordEncodingService.matches("123456", encode);
        System.out.println(matches);
        Assertions.assertTrue(matches);
    }

}
