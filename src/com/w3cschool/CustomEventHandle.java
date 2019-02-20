package com.w3cschool;

import org.springframework.context.ApplicationListener;

public class CustomEventHandle implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event){
        System.out.println(event.toString());
    }

}
