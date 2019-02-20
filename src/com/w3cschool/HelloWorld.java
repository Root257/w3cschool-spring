package com.w3cschool;

public class HelloWorld {
    private String message;
    public  void setMessage(String message)
    {
        this.message = message;
    }
    public void getMessage()
    {
        System.out.println("Your Message:"+message);
    }
}
