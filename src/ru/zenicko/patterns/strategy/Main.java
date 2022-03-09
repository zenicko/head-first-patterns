package ru.zenicko.patterns.strategy;

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
    }
}
