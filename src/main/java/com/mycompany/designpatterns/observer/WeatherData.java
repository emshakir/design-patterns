package com.mycompany.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if (idx >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurmentsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature,
            float humidity,
            float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }

}
