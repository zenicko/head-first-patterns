package ru.zenicko.pattern3.decorator.condiments;

import ru.zenicko.pattern3.decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Mocha";
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.description;
    }

    public double cost() {
        return this.beverage.cost() + 0.2;
    }
}
