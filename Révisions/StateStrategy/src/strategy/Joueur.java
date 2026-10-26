package strategy;

public class Joueur {
    private String name;
    private int score;
    private Strat strat;

    public Joueur(String name, int score,Strat strat) {
        this.strat = strat;
        this.name = name;
        this.score = score;
    }

    public void ajouterUnPoint() {
        score++;
    }

     public Attack jouer() {
        return strat.getAttack();
     }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " : " + score + " point(s)";
    }


    public static class Main {
        public static void main(String[] args) {
            Strat stratR =  new StratRandom();
            Strat stratC = new StratChoice();

            Joueur j1 = new Joueur("moi", 0, stratC);
            Joueur j2 = new Joueur("random", 0, stratR);

            Attack attack1;
            Attack attack2;

            int res;

            while(j1.getScore()!=3 && j2.getScore()!=3) {
                System.out.println(j1.getName() + " joue : ");
                attack1 = j1.jouer();

                System.out.println(j2.getName() + " joue : ");
                attack2 = j2.jouer();

                res = attack1.compare(attack2);
                switch(res) {
                    case(-1) :
                        j2.ajouterUnPoint();
                        System.out.println(j2.getName() + " gagne");
                        break;

                    case(1) :
                        j1.ajouterUnPoint();
                        System.out.println(j1.getName() + " gagne");
                        break;

                    default :
                        throw new IllegalArgumentException();
                }
            }

            if(j1.getScore()==3) {
                System.out.println(j1.getName() + " a gagné");
            } else {
                System.out.println(j2.getName() + " a gagné");
            }
        }
    }
}


