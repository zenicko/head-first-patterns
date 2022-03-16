package ru.zenicko.patterns.observer;

import ru.zenicko.patterns.observer.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
