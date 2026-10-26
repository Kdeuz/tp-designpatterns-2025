package state;

public class DigicodeStateFinal extends DigicodeState{
    @Override
    public void handle(Digicode context, char c) {
        System.out.println("La porte est ouverte.");
    }
}
