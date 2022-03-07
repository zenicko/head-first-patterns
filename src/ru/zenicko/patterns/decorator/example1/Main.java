package ru.zenicko.patterns.decorator.example1;

public class Main {

    public static void main(String [] args) {

        DarkRoast darkRoast = new DarkRoast();


        darkRoast.setWhip(true);
        darkRoast.setSoy(true);

        System.out.println(darkRoast.getDescription() + "costs " + darkRoast.cost());

    }
}
