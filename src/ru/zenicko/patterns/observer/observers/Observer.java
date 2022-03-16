package ru.zenicko.patterns.observer.observers;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
