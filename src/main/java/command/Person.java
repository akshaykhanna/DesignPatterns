package command;

public class Person {
    private RemoteControl remoteControl;

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void switchOnTelvisionOnViaRemote(Telivision telivision) {
        this.remoteControl.setCommand(new SwitchOnTVCommand(telivision));
        remoteControl.pressButton();
    }

    public void switchOffTelvisionOnViaRemote(Telivision telivision) {
        this.remoteControl.setCommand(new SwitchOffTVCommand(telivision));
        remoteControl.pressButton();
    }
}
