package ru.zenicko.patterns.observer.weatherstations;

import ru.zenicko.patterns.observer.utils.Humidity;
import ru.zenicko.patterns.observer.utils.Pressure;
import ru.zenicko.patterns.observer.utils.Temperature;

import java.util.Random;

public class MoscowWeatherStation implements WeatherStation {
    public float getTemperature() {
        final int MAX = Temperature.MaxTemperature.getTemperature();
        final int MIN = Temperature.MinTemperature.getTemperature();

        return MIN + new Random().nextFloat() * (MAX - MIN);
    }

    public float getHumidity() {
        final int MAX = Humidity.MaxHumidity.getHumidity();
        final int MIN = Humidity.MinHumidity.getHumidity();

        return MIN + new Random().nextFloat() * (MAX - MIN);
    }

    public float getPressure() {
        final int MAX = Pressure.MaxPressure.getPressure();
        final int MIN = Pressure.MinPressure.getPressure();

        return MIN + new Random().nextFloat() * (MAX - MIN);
    }
}
