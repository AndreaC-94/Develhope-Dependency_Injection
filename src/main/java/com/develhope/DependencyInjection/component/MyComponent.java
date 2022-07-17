package com.develhope.DependencyInjection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName = "Andrea";

    public void MyComponent(String name){
        this.myComponentName = name;
    }

    public String getMyComponentName(){
        return "Hello my name is " + myComponentName;
    }
}
