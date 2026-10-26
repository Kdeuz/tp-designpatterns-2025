package digicode;

public class DigicodeState3 extends DigicodeState{

    public DigicodeState3(char digicode3Key) {
        super(digicode3Key);
    }

    @Override
    public void setNextState(Digicode digicode) {
        System.out.println("Porte ouverte !");
        digicode.setState(new DigicodeStateFinal());
    }
}
