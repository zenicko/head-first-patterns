package ru.zenicko.patterns.decorator.beverages;

public abstract class Beverage {
    protected String description = "Some beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
