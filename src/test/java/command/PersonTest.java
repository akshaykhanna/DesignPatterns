package command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void peronShouldAbleToSwitchOnTheTelvisionUsingRemoteControl() {
        // arrange
        Person person = new Person();
        RemoteControl remoteControl = new RemoteControl();
        Telivision telivision = new Telivision();
        person.setRemoteControl(remoteControl);

        // act
        person.switchOnTelvisionOnViaRemote(telivision);

        // assert
        Assertions.assertEquals(true, telivision.isOn());
    }
    @Test
    void peronShouldAbleToSwitchOffTheTelvisionUsingRemoteControl() {
        // arrange
        Person person = new Person(); // client
        RemoteControl remoteControl = new RemoteControl(); // Invoker
        Telivision telivision = new Telivision(); // Caller
        person.setRemoteControl(remoteControl);

        // act
        person.switchOffTelvisionOnViaRemote(telivision);

        // assert
        Assertions.assertEquals(true, !telivision.isOn());
    }
}