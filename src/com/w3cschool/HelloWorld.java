package com.w3cschool;
import javax.annotation.*;
public class HelloWorld {
    private String message1;
    private String message2;

//    public  void setMessage1(String message)
//    {
//        this.message1 = message;
//    }
    public void getMessage1()
    {
        System.out.println("Wor Message:"+message1);
    }
    public  void setMessage2(String message)
    {
        this.message2 = message;
    }
    public void getMessage2()
    {
        System.out.println("Your Message:"+message2);
    }
    public void init1(){
        System.out.println("Bean is going through init.");
    }
    public void destroy1(){
        System.out.println("Bean will destroy now.");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init PostConstruct .");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now PreDestroy");
    }
}
