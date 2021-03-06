package ru.zenicko.patterns.strategy;

import ru.zenicko.patterns.strategy.behaviors.flies.FlyBehavior;
import ru.zenicko.patterns.strategy.behaviors.quackes.QuackBehavior;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("I'm swimming");
    }
    public void performanceQuack() {
        quackBehavior.quack();
    }
    public void performanceFly() {
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    protected String lastElement(Class tClass) {

        return Arrays.stream(tClass.getName().split("\\."))
                .collect(Collectors.toList())
                .stream()
                .reduce((e1, e2)->e2)
                .orElse(null);
    }

}
