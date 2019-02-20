package com.w3cschool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args){

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomEventPublisher cvp= (CustomEventPublisher)context.getBean("customEventPublisher");
        cvp.publish();
//        TextEditor textEditor = context.getBean(TextEditor.class);
//        textEditor.spellCheck();
      //  context.registerShutdownHook();
    }
}
