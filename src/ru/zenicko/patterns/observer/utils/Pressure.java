package ru.zenicko.patterns.observer.utils;

public enum Pressure {
    MaxPressure(816),
    MinPressure(641);

    private int pressure;

    Pressure(int i) {
        pressure = i;
    }

    public int getPressure() {
        return pressure;
    }
}
