package ru.zenicko.patterns.observer.utils;

public enum Temperature {
    MaxTemperature(-50),
    MinTemperature(50);
    private int temperature;

    Temperature(int i) {
        temperature = i;
    }
    public int getTemperature() {
        return temperature;
    }

}
