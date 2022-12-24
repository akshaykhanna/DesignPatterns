package command;

public class Telivision {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void switchItON() {
        this.isOn = true;
    }

    public void switchItOff() {
        this.isOn = false;
    }
}
