package WeatherStation;

import WeatherStation.Observer.impl.AvrConditionDisplay;
import WeatherStation.Observer.impl.CurrentConditionDisplay;
import WeatherStation.Subject.impl.WeatherData;

public class MiniWeatherSystem {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        AvrConditionDisplay avrConditionDisplay = new AvrConditionDisplay(weatherData);

        weatherData.setMeasurements(3,4,5);
        weatherData.setMeasurements(7,6,5);
    }
}
