package ru.zenicko.patterns.decorator.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Bland";
    }
    public double cost() {
        return .89;
    }
}
