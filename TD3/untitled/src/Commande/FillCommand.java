package Commande;

public class FillCommand extends Command{

    private Can can;
    private int volume;

    public FillCommand(Can can) {
        this.can = can;
        this.volume = can.getVolume();
    }

    @Override
    public void execute() {
        can.fill();
    }

    @Override
    public void undo() {
        can.setVolume(volume);
    }
}
