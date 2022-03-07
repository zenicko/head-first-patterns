package ru.zenicko.patterns.observer.step1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Duck {
    void quack() {
        System.out.println("Quack! Quack! Quack!");
    }
    void swim() {
        System.out.println("I'm swimming");
    }
    protected String lastElement(Class tClass) {

        return Arrays.stream(tClass.getName().split("\\."))
                .collect(Collectors.toList())
                .stream()
                .reduce((e1, e2)->e2)
                .orElse(null);
    }
    abstract void display();
}
