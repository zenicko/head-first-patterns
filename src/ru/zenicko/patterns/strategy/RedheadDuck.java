package ru.zenicko.patterns.strategy;

import ru.zenicko.patterns.strategy.behaviors.flies.FlyWithWings;
import ru.zenicko.patterns.strategy.behaviors.quackes.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display () {
        System.out.println("I'm " + lastElement(RedheadDuck.class));
    }

}
