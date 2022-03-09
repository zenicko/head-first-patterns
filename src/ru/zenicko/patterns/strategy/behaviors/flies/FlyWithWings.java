package ru.zenicko.patterns.strategy.behaviors.flies;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Wings upDown");
    }
}
