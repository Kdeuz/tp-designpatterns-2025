package state;

public class DigicodeState0 extends DigicodeState{
    @Override
    public void handle(Digicode context, char c) {
        if(c == 'a') {
                System.out.println("Passage à l'état 1");
            context.setState(new DigicodeState1());
        } else {
            super.handle(context, c);
        }
    }
}
