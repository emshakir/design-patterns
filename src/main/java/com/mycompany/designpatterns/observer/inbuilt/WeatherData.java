package com.mycompany.designpatterns.observer.inbuilt;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurmentsChanged() {
        setChanged();
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

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
