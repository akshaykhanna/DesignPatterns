package observer;

public class PhoneTemperatureObserver implements ITemperatureObserver {
    String displayTemperature;

    public PhoneTemperatureObserver(String displayTemperature) {
        this.displayTemperature = displayTemperature;
    }

    @Override
    public void update(String temperature) {
        this.displayTemperature = temperature;
    }

    @Override
    public String temperature() {
        return displayTemperature;
    }
}
