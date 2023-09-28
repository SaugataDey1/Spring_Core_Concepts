package com.lcwd.core.couple;

import org.springframework.stereotype.Component;
//@Component
public class Samosa {

    String name;

    public Samosa(String name)
    {
        System.out.println("This is : " + name);
        this.name=name;
    }
    public void eat()
    {
        System.out.println("Wow samosa is very spicy : " + name);
    }
}
