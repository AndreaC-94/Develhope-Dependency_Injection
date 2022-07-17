package com.develhope.DependencyInjection.service;

import com.develhope.DependencyInjection.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent component){
        this.myComponent = component;
    }

    public String getName(){
        System.out.println("MyService's getName has been called");
        return myComponent.getMyComponentName();
    }
}
