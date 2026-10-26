package digicode;

public class DigicodeStateNotOk extends DigicodeState{
    public DigicodeStateNotOk() {
    }

    @Override
    public boolean process(char touche, Digicode digicode) {
        System.out.println("CODE ERRONÉ");
        return false;
    }

}
