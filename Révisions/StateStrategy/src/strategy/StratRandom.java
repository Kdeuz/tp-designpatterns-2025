package strategy;

import java.util.Random;

public class StratRandom implements Strat{
    Random rand = new Random();

    @Override
    public Attack getAttack() {
        return Attack.values()[rand.nextInt(3)];
    }
}
