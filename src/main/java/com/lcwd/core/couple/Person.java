package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person
{
    //@Autowired
    // @Qualifier("cat")
    @Autowired
    Animal animal;
    @Autowired
    Student student;

    /*
    @Autowired
    @Qualifier("samosa_1")
    Samosa samosa;

     */

    /*
   // @Autowired
    public Person(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }
     */

    /*
        // constructor based injection --> for mandatory purpose
        @Autowired
        public Person(Animal animal, Student student)
        {
            System.out.println("calling constructor...Autowiring");
            this.animal = animal;
            this.student = student;
        }
    */

    /*
        public Animal getAnimal() {
            return animal;
        }

        // using Autowired on setter : Animal  --> for optional : setter injection
        @Autowired
        public void setAnimal(Animal animal) {
            System.out.println("setting Animal");
            this.animal = animal;
        }

        public Student getStudent() {
            return student;
        }

        // using Autowired on setter : Student
        @Autowired
        public void setStudent(Student student) {
            System.out.println("setting Student");
            this.student = student;
        }

     */

    public void playWithAnimal()
    {
        animal.play();
        student.detail();
       // samosa.eat();
    }
}
