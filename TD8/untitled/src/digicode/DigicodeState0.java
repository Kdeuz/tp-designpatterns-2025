package digicode;

public class DigicodeState0 extends DigicodeState{

    public DigicodeState0(char touche) {
        super(touche);
    }




    @Override
    public void setNextState(Digicode digicode) {
        digicode.setState(new DigicodeState1(DigicodeStateKeys.DIGICODE1_KEY));
    }
}
