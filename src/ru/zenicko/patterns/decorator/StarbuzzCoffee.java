package ru.zenicko.patterns.decorator;

import ru.zenicko.patterns.decorator.beverages.Beverage;
import ru.zenicko.patterns.decorator.beverages.DarkRoast;
import ru.zenicko.patterns.decorator.beverages.Espresso;
import ru.zenicko.patterns.decorator.beverages.HouseBlend;
import ru.zenicko.patterns.decorator.condiments.Mocha;
import ru.zenicko.patterns.decorator.condiments.Soy;
import ru.zenicko.patterns.decorator.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
