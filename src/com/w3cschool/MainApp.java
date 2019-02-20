package com.w3cschool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args){

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        context.stop();
//        TextEditor textEditor = context.getBean(TextEditor.class);
//        textEditor.spellCheck();
      //  context.registerShutdownHook();
    }
}
