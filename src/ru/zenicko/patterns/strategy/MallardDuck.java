package ru.zenicko.patterns.strategy;

import ru.zenicko.patterns.strategy.behaviors.flies.FlyWithWings;
import ru.zenicko.patterns.strategy.behaviors.quackes.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("I'm " + lastElement(MallardDuck.class));
    }

}
