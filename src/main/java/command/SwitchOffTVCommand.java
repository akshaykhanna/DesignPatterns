package command;

public class SwitchOffTVCommand implements Command {
    private Telivision telivision;

    public SwitchOffTVCommand(Telivision telivision) {
        this.telivision = telivision;
    }

    @Override
    public void execute() {
        this.telivision.switchItOff();
    }
}
