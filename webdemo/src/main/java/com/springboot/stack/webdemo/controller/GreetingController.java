package com.springboot.stack.webdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


import com.springboot.stack.webdemo.model.Greeting;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private AtomicLong aLong = new AtomicLong(0);

    public GreetingController() {
        //TODO
        System.out.println("11111");
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "wordk") String name){
        return new Greeting(aLong.getAndIncrement(),String.format(template,name));
    }
}
