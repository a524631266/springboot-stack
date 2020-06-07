package com.springboot.stack.websecuritydemo.demo.service;

import com.springboot.stack.websecuritydemo.demo.mapper.AdminRepository;
import com.springboot.stack.websecuritydemo.demo.model.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean contains(Admin admin){

        Admin resultAdmin = adminRepository.getAdmin(admin.getPhone());
        return resultAdmin.passwordRight(admin);
    }
}
