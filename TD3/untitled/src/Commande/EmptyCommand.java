package Commande;

public class EmptyCommand extends Command{

    private Can can;
    private int volume;

    public EmptyCommand(Can can) {
        this.can = can;
        this.volume = can.getVolume();
    }

    @Override
    public void execute() {
        can.empty();
    }

    @Override
    public void undo() {
        can.setVolume(volume);
    }
}
