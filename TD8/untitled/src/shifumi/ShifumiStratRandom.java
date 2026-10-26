package shifumi;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShifumiStratRandom extends ShifumiStrategy{

    @Override
    public Attack jouer() {
        List<Attack> attacks = Arrays.asList(Attack.PIERRE, Attack.CISEAUX, Attack.FEUILLE);
        Random rand = new Random();
        return attacks.get(rand.nextInt(attacks.size()));
    }
}
