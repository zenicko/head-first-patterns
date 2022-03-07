package ru.zenicko.patterns.decorator.beverages;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }
    public double cost() {
        return .99;
    }
}
