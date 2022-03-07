package ru.zenicko.patterns.observer.step1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MallardDuck extends Duck {
    void display () {
        System.out.println("I'm " + lastElement(MallardDuck.class));
    }

}
