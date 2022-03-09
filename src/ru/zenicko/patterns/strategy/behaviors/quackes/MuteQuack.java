package ru.zenicko.patterns.strategy.behaviors.quackes;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Mute.....");
    }
}
