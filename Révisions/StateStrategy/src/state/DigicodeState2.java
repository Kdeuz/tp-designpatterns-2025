package state;

public class DigicodeState2 extends DigicodeState{
    @Override
    public void handle(Digicode context, char c) {
        if(c == 'd') {
            System.out.println("Passage à l'état 3");
            context.setState(new DigicodeState3());
        } else {
            super.handle(context, c);
        }
    }
}
