package WeatherStation.Observer;

import WeatherStation.pojo.WeatherInfo;

public interface Observer {
     void update(WeatherInfo weatherInfo);
}
