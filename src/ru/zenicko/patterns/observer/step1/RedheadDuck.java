package ru.zenicko.patterns.observer.step1;

public class RedheadDuck extends Duck {
    void display () {
        System.out.println("I'm " + lastElement(RedheadDuck.class));
    }
    
}
