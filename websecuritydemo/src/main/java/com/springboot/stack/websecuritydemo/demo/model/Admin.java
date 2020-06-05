package com.springboot.stack.websecuritydemo.demo.model;

public class Admin {
    private final String name ;
    private final String password;
    private final String phone;

    public Admin(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public boolean passwordRight(Admin admin){
        return  this.phone.equals(admin.getPhone()) && this.password.equals(admin.getPassword());
    }
}
