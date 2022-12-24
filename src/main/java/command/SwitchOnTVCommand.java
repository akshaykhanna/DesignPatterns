package command;

public class SwitchOnTVCommand implements Command {
    private Telivision telivision;

    public SwitchOnTVCommand(Telivision telivision) {
        this.telivision = telivision;
    }

    @Override
    public void execute() {
        this.telivision.switchItON();
    }
}
