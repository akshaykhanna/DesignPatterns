package observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTemperatureAPIFlow {

    private String initialTemperature;
    private TemperatureAPI temperatureAPI;
    private ITemperatureObserver phoneTemperatureWidgetObserver;

    @BeforeEach
    void setUp() {
        initialTemperature = "25C";
        temperatureAPI = new TemperatureAPI(initialTemperature);
        phoneTemperatureWidgetObserver = new PhoneTemperatureObserver(temperatureAPI.temperature());
        temperatureAPI.register(phoneTemperatureWidgetObserver);
    }

    @Test
    void phoneWidgetShouldAbleToShowInitialTemperatureFromTemperatureAPI() {
        Assertions.assertEquals(initialTemperature, phoneTemperatureWidgetObserver.temperature());
    }
    @Test
    void phoneWidgetShouldGetUpdatedTemperatureWhenTemperatureAPIUpdatesIt() {
        String newTemperature = "27C";
        temperatureAPI.setTemperature(newTemperature);
        Assertions.assertEquals(newTemperature, phoneTemperatureWidgetObserver.temperature());
    }
    @Test
    void phoneWidgetAndSmartBandShouldGetUpdatedTemperatureWhenTemperatureAPIUpdatesIt() {
        // arrange
        ITemperatureObserver smartBandObserver = new SmartBandObserver(temperatureAPI.temperature());
        temperatureAPI.register(smartBandObserver);

        // act
        String newTemperature = "27C";
        temperatureAPI.setTemperature(newTemperature);

        // assert
        Assertions.assertEquals(newTemperature, phoneTemperatureWidgetObserver.temperature());
        Assertions.assertEquals(newTemperature, smartBandObserver.temperature());
    }
    @Test
    void smartBandShouldGetUpdatedTemperatureButPhoneWidgetSinceUnRegisteredShouldStillHaveOldOneWhenTempAPIUpdates() {
        // arrange
        ITemperatureObserver smartBandObserver = new SmartBandObserver(temperatureAPI.temperature());
        temperatureAPI.register(smartBandObserver);
        temperatureAPI.unRegister(phoneTemperatureWidgetObserver);

        // act
        String newTemperature = "27C";
        temperatureAPI.setTemperature(newTemperature);

        // assert
        Assertions.assertEquals(initialTemperature, phoneTemperatureWidgetObserver.temperature());
        Assertions.assertEquals(newTemperature, smartBandObserver.temperature());
    }
}