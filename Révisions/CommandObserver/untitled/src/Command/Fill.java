package Command;

public class Fill implements Command {

    private Can receiver;
    protected int decantedVolume;

    public Fill (Can receiver) {
        this.receiver = receiver;
        this.decantedVolume = 0;
    }

    @Override
    public void execute() {
        decantedVolume = receiver.getVolume();
        receiver.fill();
    }

    @Override
    public void cancel() {
        receiver.setVolume(decantedVolume);
    }

    @Override
    public String toString() {
        return "Fill";
    }
}
