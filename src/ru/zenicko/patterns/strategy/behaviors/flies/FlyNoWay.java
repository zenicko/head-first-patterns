package ru.zenicko.patterns.strategy.behaviors.flies;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("Not fly!");
    }
}
