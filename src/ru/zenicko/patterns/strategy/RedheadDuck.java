package ru.zenicko.patterns.strategy;

public class RedheadDuck extends Duck {
    void display () {
        System.out.println("I'm " + lastElement(RedheadDuck.class));
    }
    
}
