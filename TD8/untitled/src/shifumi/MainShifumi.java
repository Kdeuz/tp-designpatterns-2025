package shifumi;

import java.util.Scanner;

public class MainShifumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez la stratégie du joueur 1 :" +
                "1 : Random\n" +
                "2 : Same\n" +
                "3 : Choice"
        );
        ShifumiStrategy strat;
        strat = getShifumiStrategy(scanner);
        Joueur joueur1 = new Joueur("joueur1", strat);
        strat = getShifumiStrategy(scanner);
        Joueur joueur2 = new Joueur("joueur2", strat);

        for(int i = 0; i<3; i++) {
           int winner = joueur1.jouer().compare(joueur2.jouer());
           switch(winner) {
               case 1 :
                   joueur1.ajouterUnPoint();
                   break;

               default :
                   joueur2.ajouterUnPoint();
                   break;
           }
        }
        System.out.println("Le joueur 1 a gagné : " + joueur1.getScore() + " parties");
        System.out.println("Le joueur 2 a gagné : " + joueur2.getScore() + " parties");

    }

    private static ShifumiStrategy getShifumiStrategy(Scanner scanner) {
        ShifumiStrategy strat;
        switch(scanner.nextInt()) {
            case 1 :
                strat = new ShifumiStratRandom();
                break;
            case 2 :
                System.out.println("Entrez l'attaque que vous voulez :" +
                        "1 : Pierre\n" +
                        "2 : Feuille\n" +
                        "3 : Ciseaux\n");
                switch(scanner.nextInt()) {
                    case 1 :
                        strat = new ShifumiStratSame(Attack.PIERRE);
                        break;
                    case 2 :
                        strat = new ShifumiStratSame(Attack.FEUILLE);
                        break;
                    case 3 :
                        strat = new ShifumiStratSame(Attack.CISEAUX);
                        break;
                    default :
                        throw new IllegalArgumentException();
                    }

            case 3 :
                 strat = new ShifumiStratChoice();
                 break;

            default :
                throw new IllegalArgumentException();
        }
        return strat;
    }
}
