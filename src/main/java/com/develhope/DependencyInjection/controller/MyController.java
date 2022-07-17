package com.develhope.DependencyInjection.controller;

import com.develhope.DependencyInjection.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    @Autowired
    public MyController(MyService service){
        this.myService = service;
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController's getName has been called");
        return myService.getName();
    }

    @GetMapping("/")
    public String getHi(){
        return "Welcome to my fist program!";
    }
}
