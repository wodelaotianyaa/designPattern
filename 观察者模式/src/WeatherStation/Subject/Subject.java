package WeatherStation.Subject;

import WeatherStation.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers();
}
