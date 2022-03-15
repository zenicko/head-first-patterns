package ru.zenicko.patterns.observer.utils;

public enum Humidity {
    MaxHumidity(100),
    MinHumidity(0);
    private int humidity;

    Humidity(int i) {
        humidity = i;
    }

    public int getHumidity() {
        return humidity;
    }

}
