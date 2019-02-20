package com.w3cschool;
import javax.annotation.*;
public class HelloWorld {
    private String message;

    public void getMessage()
    {
        System.out.println("Wor Message:"+message);
    }
    public  void setMessage(String message)
    {
        this.message = message;
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
