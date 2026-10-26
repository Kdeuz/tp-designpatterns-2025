package digicode;

public class DigicodeState2 extends DigicodeState{
    public DigicodeState2(char touche) {
        super(touche);
    }

    @Override
    public void setNextState(Digicode digicode) {
        digicode.setState(new DigicodeState3(DigicodeStateKeys.DIGICODE3_KEY));
    }
}
