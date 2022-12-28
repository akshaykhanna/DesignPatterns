package observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAPI implements ITemperatureSubject {
    private String temperature;
    private List<ITemperatureObserver> temperatureObservers;

    public TemperatureAPI(String temperature) {
        this.temperature = temperature;
        this.temperatureObservers = new ArrayList<>();
    }

    @Override
    public void register(ITemperatureObserver observer) {
        this.temperatureObservers.add(observer);
    }

    @Override
    public void unRegister(ITemperatureObserver observer) {
        this.temperatureObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (ITemperatureObserver observer : this.temperatureObservers) {
            observer.update(this.temperature());
        }
    }

    public String temperature() {
        return temperature;
    }

    public void setTemperature(String newTemp) {
        this.temperature = newTemp;
        this.notifyAllObservers();
    }
}
