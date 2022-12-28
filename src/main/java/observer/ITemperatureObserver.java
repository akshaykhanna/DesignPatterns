package observer;

public interface ITemperatureObserver {
    void update(String temperature);

    String temperature();
}
