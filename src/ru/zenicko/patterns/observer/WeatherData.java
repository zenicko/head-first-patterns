package ru.zenicko.patterns.observer;

import ru.zenicko.patterns.observer.observers.Observer;
import ru.zenicko.patterns.observer.weatherstations.WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(WeatherStation weatherStation) {
       this.temp = weatherStation.getTemperature();
       this.humidity = weatherStation.getHumidity();
       this.pressure = weatherStation.getPressure();
       measurementsChanged();
    }

}
