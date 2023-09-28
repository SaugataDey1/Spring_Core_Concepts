package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

@Component
public class Student
{
    public Student()
    {
        System.out.println("creating student");
    }

    public void detail()
    {
        System.out.println("I am student detail");
    }

    @PostConstruct
    public void created()
    {
        // some initialization
        System.out.println("Student bean is created : created()");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("Bye Bye student bean : destroy()");
    }
}
