package state;

public class DigicodeState3 extends DigicodeState{
    @Override
    public void handle(Digicode context, char c) {
        if(c == 'c') {
            System.out.println("Passage à l'état final. La porte s'ouvre...");
            context.setState(new DigicodeStateFinal());
        } else {
            super.handle(context, c);
        }
    }
}
