package observer;

public class SmartBandObserver implements ITemperatureObserver {
    String displayedTemperature;

    public SmartBandObserver(String temperature) {
        this.displayedTemperature = temperature;
    }

    @Override
    public void update(String temperature) {
        displayedTemperature = temperature;
    }

    @Override
    public String temperature() {
        return this.displayedTemperature;
    }
}
