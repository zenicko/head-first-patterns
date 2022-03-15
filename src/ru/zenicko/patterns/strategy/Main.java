package ru.zenicko.patterns.strategy;

import ru.zenicko.patterns.strategy.behaviors.flies.FlyRocketPowered;
import ru.zenicko.patterns.strategy.behaviors.quackes.Quack;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        System.out.println("MallardDuck");
        mallardDuck.display();
        mallardDuck.performanceQuack();
        mallardDuck.performanceFly();
        mallardDuck.swim();

        System.out.println("RedheadDuck");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performanceQuack();
        redheadDuck.performanceFly();
        redheadDuck.swim();

        System.out.println("DecoyDuck");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.swim();
        decoyDuck.performanceFly();
        decoyDuck.performanceQuack();
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.performanceFly();

        System.out.println("the Duck call");
        DuckCall duckCall = new DuckCall();
        duckCall.perfomanceQuack();
        duckCall.setQuackBehavior(new Quack());
        duckCall.perfomanceQuack();


    }
}
