package digicode;

public class DigicodeStateFinal extends DigicodeState{
    public DigicodeStateFinal() {
    }

    @Override
    public boolean process(char touche, Digicode digicode) {
        System.out.println("Porte ouverte !");
        return false;
    }

}
