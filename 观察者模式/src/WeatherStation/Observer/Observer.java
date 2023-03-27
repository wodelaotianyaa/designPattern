package WeatherStation.Observer;

import WeatherStation.pojo.WeatherInfo;

public interface Observer {
    public void update(WeatherInfo weatherInfo);
}
