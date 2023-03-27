package WeatherStation.Observer.impl;

import WeatherStation.Observer.Observer;
import WeatherStation.Subject.Subject;
import WeatherStation.Tools.DisplayElement;
import WeatherStation.pojo.WeatherInfo;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    //只提供信息修改的方法，调用不归自己管
    public WeatherInfo weatherInfo = new WeatherInfo();

    //其实一个主题也就是一个ArrayLiast,订阅同一个主题得锚定同一个Subject对象
    public Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(WeatherInfo wi) {
        weatherInfo.temperature = wi.temperature;
        weatherInfo.pressure = wi.pressure;
        weatherInfo.humidity = wi.humidity;
        display();
    }


    @Override
    public void display() {
        System.out.println(weatherInfo.toString());
    }
}
