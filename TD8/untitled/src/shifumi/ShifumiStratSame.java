package shifumi;

public class ShifumiStratSame extends ShifumiStrategy {
    private Attack attack;

    public ShifumiStratSame(Attack attack) {
        this.attack = attack;
    }

    public Attack jouer() {
        return attack;
    }
}
