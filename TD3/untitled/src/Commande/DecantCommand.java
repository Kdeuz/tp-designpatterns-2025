package Commande;

public class DecantCommand extends Command{

    private Can source;
    private Can target;
    private int volume;

    public DecantCommand(Can source, Can target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public void execute() {
        int sourceVolume = source.getVolume();
        int targetMaxVolume = target.getMaxVolume();
        int targetVolume = target.getVolume();
        int targetFreeVolume = targetMaxVolume - targetVolume;

        this.volume = Math.min(sourceVolume, targetFreeVolume);

        source.decant(target);
    }

    @Override
    public void undo() {
        source.setVolume(source.getVolume() + volume);
        target.setVolume(target.getVolume() - volume);
    }
}
