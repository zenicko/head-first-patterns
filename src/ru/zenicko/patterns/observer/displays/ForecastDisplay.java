package ru.zenicko.patterns.observer.displays;

import ru.zenicko.patterns.observer.Subject;
import ru.zenicko.patterns.observer.displayelements.DisplayElement;
import ru.zenicko.patterns.observer.observers.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 729.92f;
    private float lastPressure;
    Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("currentPressure = " + (int) currentPressure + " lastPressure = " + (int) lastPressure);

    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
