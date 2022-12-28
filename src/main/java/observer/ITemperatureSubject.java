package observer;

public interface ITemperatureSubject {
    void register(ITemperatureObserver observer);
    void unRegister(ITemperatureObserver observer);
    void notifyAllObservers();

}
