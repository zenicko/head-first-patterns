package ru.zenicko.patterns.observer;

import ru.zenicko.patterns.observer.displays.CurrentConditionsDisplay;
import ru.zenicko.patterns.observer.weatherstations.MoscowWeatherStation;

public class AppWeatherORama {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        MoscowWeatherStation moscowWeatherStation = new MoscowWeatherStation();


        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(moscowWeatherStation);
        weatherData.setMeasurements(moscowWeatherStation);
        weatherData.setMeasurements(moscowWeatherStation);
        weatherData.setMeasurements(moscowWeatherStation);
    }
}
