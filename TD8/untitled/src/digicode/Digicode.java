package digicode;

import java.util.ArrayList;
import java.util.List;

public class Digicode {
    private DigicodeState state;

    public Digicode() {
        this.state = new DigicodeState0(DigicodeStateKeys.DIGICODE0_KEY);
    }

    public void setState(DigicodeState state) {
        this.state = state;
    }

    public DigicodeState getState() {
        return this.state;
    }

    public boolean appuyer(char touche) {
        if(DigicodeStateKeys.DIGICODE_CHARLIST.contains(touche)) {
            return state.process(touche, this);
        }
        StringBuilder str = new StringBuilder("Seulement les caractères suivants : ");

        for(char c : DigicodeStateKeys.DIGICODE_CHARLIST) {
            str.append(c).append(", ");
        }

        throw new IllegalArgumentException(str.toString());
    }
}
