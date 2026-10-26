package Command;

public class Empty implements Command{
    private Can receiver;
    protected int decanted;

    public Empty(Can receiver) {
        this.receiver = receiver;
        this.decanted = 0;
    }

    @Override
    public void execute() {
        decanted = receiver.getVolume();
        receiver.empty();
    }

    @Override
    public void cancel() {
        receiver.setVolume(decanted);
    }

    @Override
    public String toString() {
        return "Empty";
    }
}
