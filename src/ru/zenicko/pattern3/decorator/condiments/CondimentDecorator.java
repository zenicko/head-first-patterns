package ru.zenicko.pattern3.decorator.condiments;

import ru.zenicko.pattern3.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

}
