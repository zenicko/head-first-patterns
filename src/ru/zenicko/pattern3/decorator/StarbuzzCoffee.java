package ru.zenicko.pattern3.decorator;

import ru.zenicko.pattern3.decorator.beverages.Beverage;
import ru.zenicko.pattern3.decorator.beverages.DarkRoast;
import ru.zenicko.pattern3.decorator.beverages.Espresso;
import ru.zenicko.pattern3.decorator.beverages.HouseBlend;
import ru.zenicko.pattern3.decorator.condiments.Mocha;
import ru.zenicko.pattern3.decorator.condiments.Soy;
import ru.zenicko.pattern3.decorator.condiments.Whip;

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
