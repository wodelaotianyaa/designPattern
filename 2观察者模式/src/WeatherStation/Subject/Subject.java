package WeatherStation.Subject;

import WeatherStation.Observer.Observer;

public interface Subject {
     void registerObserver(Observer observer);

     void deleteObserver(Observer observer);

     void notifyObservers();
}
