package ru.zenicko.patterns.decorator.condiments;

import ru.zenicko.patterns.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Whip";
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.description;
    }

    public double cost() {
        return this.beverage.cost() + 0.1;
    }
}
