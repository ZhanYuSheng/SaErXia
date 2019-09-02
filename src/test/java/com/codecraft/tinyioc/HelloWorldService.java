package com.codecraft.tinyioc;

public class HelloWorldService {

    String name;

    String text;

    public void saySomething(){
        System.out.println(name+", "+text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }
}
