package Command;

public class Decant implements Command{

    private Can receiver;
    private Can receiver2;
    protected int decantedVolume;

    public Decant(Can receiver, Can receiver2) {
        this.receiver = receiver;
        this.receiver2 = receiver2;
        this.decantedVolume = 0;
    }

    @Override
    public void execute() {
        decantedVolume = receiver.decant(receiver2);
    }

    @Override
    public void cancel() {
        receiver.setVolume(receiver.getVolume()+decantedVolume);
        receiver2.setVolume(receiver2.getVolume()-decantedVolume);
    }

    @Override
    public String toString() {
        return "Decant";
    }
}
