package WeatherStation.Subject.impl;

import WeatherStation.Observer.Observer;
import WeatherStation.Subject.Subject;
import WeatherStation.pojo.WeatherInfo;

import java.util.ArrayList;

public class WeatherData implements Subject {

    public ArrayList<Observer> observers;
    public WeatherInfo weatherInfo = new WeatherInfo();

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(weatherInfo);
        }
    }

    public void weatherInfoChange() {
        notifyObservers();
    }

    public void setMeasurements(float tem, float hd, float ps) {
        weatherInfo.humidity = hd;
        weatherInfo.temperature = tem;
        weatherInfo.pressure = ps;
        weatherInfoChange();
    }

}
