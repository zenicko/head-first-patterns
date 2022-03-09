package ru.zenicko.patterns.strategy.behaviors.quackes;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!Quack!Quack!Quack!");
    }
}
