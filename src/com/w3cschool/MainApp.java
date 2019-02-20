package com.w3cschool;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args){
      //  XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       // ApplicationContext context = new FileSystemXmlApplicationContext("D:/StudySpace/w3cschool/src/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage1();
        obj.getMessage2();
        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
      //  HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
       // obj1.getMessage();
        //context.registerShutdownHook();
    }
}
