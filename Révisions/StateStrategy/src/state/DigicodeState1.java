package state;

public class DigicodeState1 extends DigicodeState{
    @Override
    public void handle(Digicode context, char c) {
        if(c == 'c') {
            System.out.println("Passage à l'état 2");
            context.setState(new DigicodeState2());
        } else {
            super.handle(context, c);
        }
    }
}
