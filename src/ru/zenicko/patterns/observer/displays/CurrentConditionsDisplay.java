package ru.zenicko.patterns.observer.displays;

import ru.zenicko.patterns.observer.Subject;
import ru.zenicko.patterns.observer.displayelements.DisplayElement;
import ru.zenicko.patterns.observer.observers.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData =  weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        String str = String.format("Current conditions: %3.1f degrees and %3.1f%% humidity", temperature, humidity);
        System.out.println(str);
    }
}
