package ru.zenicko.pattern3.decorator.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Bland";
    }
    public double cost() {
        return .89;
    }
}
