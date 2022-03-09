package ru.zenicko.patterns.strategy.behaviors.quackes;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak, squeak, squeak");
    }
}
