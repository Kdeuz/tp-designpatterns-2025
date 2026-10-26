package digicode;

public abstract class DigicodeState {
    private char touche;

    public DigicodeState() {
    }

    public DigicodeState(char touche) {
        this.touche = touche;
    }

    public boolean process(char touche, Digicode digicode) {
        if(check(touche)) {
            setNextState(digicode);
            return true;
        }
        setNotOkState(digicode);
        return false;
    }

    public boolean check(char touche) {
        if(touche == this.touche) {
            return true;
        }
        return false;
    }

    public void setNotOkState(Digicode digicode) {
        System.out.println("CODE ERRONÉ");
        digicode.setState(new DigicodeStateNotOk());
    }

    public void setNextState(Digicode digicode) {
    }
}
