package ru.zenicko.pattern3.decorator.condiments;

import ru.zenicko.pattern3.decorator.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Soy";
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.description;
    }

    public double cost() {
        return this.beverage.cost() + 0.15;
    }
}
