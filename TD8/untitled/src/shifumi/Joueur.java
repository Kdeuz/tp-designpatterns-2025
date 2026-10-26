package shifumi;

import java.util.Scanner;

public class Joueur {
    private int score;
    private String name;
    private ShifumiStrategy strat;

    public Joueur(String name, ShifumiStrategy strat) {
        this.score = 0;
        this.name = name;
        this.strat = strat;
    }

    public void ajouterUnPoint() {
        this.score++;
    }

    public void setStrat(ShifumiStrategy strat) {
        this.strat = strat;
    }

    public int getScore() {
        return score;
    }

    public Attack jouer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + "joue :");
        return strat.jouer();
    }
}
