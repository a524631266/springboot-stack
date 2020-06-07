package com.springboot.stack.websecuritydemo.demo.controller;

import com.springboot.stack.websecuritydemo.demo.model.Admin;
import com.springboot.stack.websecuritydemo.demo.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LoginController {
    private final AdminService adminService;

    public LoginController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("/login")
    public void login(HttpServletResponse response) throws IOException {
        System.out.println("!1111");
        response.sendRedirect("login.html");
    }

    @PostMapping("/wxlogin")
    public void login(HttpServletResponse response,Admin admin) throws IOException {
        // y验证数据是否正常
        boolean contains = adminService.contains(admin);
        if (contains){
            response.sendRedirect("hello.html");
        } else{
            response.sendRedirect("login.html");
        }
    }
}
