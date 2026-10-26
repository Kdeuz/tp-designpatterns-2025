package digicode;

public class DigicodeState1 extends DigicodeState {

    public DigicodeState1(char touche) {
        super(touche);
    }

    @Override
    public void setNextState(Digicode digicode) {
        digicode.setState(new DigicodeState2(DigicodeStateKeys.DIGICODE2_KEY));
    }


}
