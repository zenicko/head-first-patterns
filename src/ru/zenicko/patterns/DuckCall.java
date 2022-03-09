package ru.zenicko.patterns;

import ru.zenicko.patterns.strategy.behaviors.quackes.MuteQuack;
import ru.zenicko.patterns.strategy.behaviors.quackes.QuackBehavior;

public class DuckCall {
    private QuackBehavior quackBehavior;

    public DuckCall () {
        quackBehavior = new MuteQuack();
    }
    public DuckCall (QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void perfomanceQuack() {
        quackBehavior.quack();
    }

}
