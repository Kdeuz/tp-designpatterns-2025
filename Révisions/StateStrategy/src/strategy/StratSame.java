package strategy;

public class StratSame implements Strat{
    private Attack attack;

    public StratSame(Attack attack) {
        this.attack = attack;
    }

    @Override
    public Attack getAttack() {
        return attack;
    }
}
