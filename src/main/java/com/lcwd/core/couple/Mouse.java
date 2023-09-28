package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Mouse {
    public Mouse()
    {
        System.out.println("Mouse is created");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("Mouse bean is created --> created()");
    }

    @PreDestroy
    public void preConstruct()
    {
        System.out.println("Bye Bye Mouse bean --> destroy()");
    }
}
