package digicode;

public class Digicode1 {
    private Digicode1States state;

    public Digicode1() {
        this.state = Digicode1States.STATE0;
    }

    public Digicode1States getState() {
        return state;
    }

    public void appuyer(char touche) {
        if(DigicodeStateKeys.DIGICODE_CHARLIST.contains(touche)) {
            if (state.equals(Digicode1States.STATE0)) {
                if (DigicodeStateKeys.DIGICODE0_KEY == touche) {
                    this.state = Digicode1States.STATE1;
                } else {
                    System.out.println("CODE NOT OK");
                    this.state = Digicode1States.NOTOKSTATE;
                }
            } else if(state.equals(Digicode1States.STATE1)) {
                if(DigicodeStateKeys.DIGICODE1_KEY == touche) {
                    this.state = Digicode1States.STATE2;
                } else {
                    System.out.println("CODE NOT OK");
                    this.state = Digicode1States.NOTOKSTATE;
                }
            } else if(state.equals(Digicode1States.STATE2)) {
                if(DigicodeStateKeys.DIGICODE2_KEY == touche) {
                    System.out.println("Door is open");
                    this.state = Digicode1States.FINALSTATE;
                } else {
                    System.out.println("CODE NOT OK");
                    this.state = Digicode1States.NOTOKSTATE;
                }
            } else if(state.equals(Digicode1States.NOTOKSTATE)) {
                System.out.println("Not Ok State");
            } else {
                System.out.println("Door is open");
            }
        } else {
            throw new IllegalArgumentException("Mauvaise touche");
        }
    }
}
