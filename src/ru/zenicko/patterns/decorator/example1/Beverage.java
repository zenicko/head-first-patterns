package ru.zenicko.patterns.decorator.example1;

public class Beverage {
    String description = "Some beverage";
    boolean milk = false;
    boolean soy = false;
    boolean mocha = false;
    boolean whip = false;

    String getDescription() {
        if (milk || soy || mocha || whip) description += " with ";

        if (milk) description += "milk ";
        if (soy) description += "soy ";
        if (mocha) description += "mocha ";
        if (whip) description += "whip ";

        return description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    double cost() {
        double cost = 0.0;

        if (milk) cost += 0.11;
        if (soy) cost += 0.12;
        if (mocha) cost += 0.13;
        if (whip) cost += 0.14;

        return cost;
    }

}


