package ru.zenicko.patterns.observer;

import ru.zenicko.patterns.observer.utils.Humidity;
import ru.zenicko.patterns.observer.utils.Pressure;
import ru.zenicko.patterns.observer.utils.Temperature;

import java.util.Random;

public class WeatherData {

    float getTemperature() {
        final int MAX = Temperature.MaxTemperature.getTemperature();
        final int MIN = Temperature.MinTemperature.getTemperature();

        return MIN + (new Random().nextFloat() * (MAX - MIN);
    }

    float getHumidity() {
        final int MAX = Humidity.MaxHumidity.getHumidity();
        final int MIN = Humidity.MinHumidity.getHumidity();

        return MIN + new Random().nextFloat() * (MAX - MIN);
    }

    float getPressure() {
        final int MAX = Pressure.MaxPressure.getPressure();
        final int MIN = Pressure.MinPressure.getPressure();

        return MIN + new Random().nextFloat() * (MAX - MIN);
    }
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

    }

}
