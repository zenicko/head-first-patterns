package ru.zenicko.patterns.decorator.example1;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    public double cost() {
        return super.cost() + 0.3;
    }
}
