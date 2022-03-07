package ru.zenicko.patterns.decorator.condiments;

import ru.zenicko.patterns.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

}
