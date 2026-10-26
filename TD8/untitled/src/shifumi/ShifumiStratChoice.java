package shifumi;

import java.util.Scanner;

public class ShifumiStratChoice extends ShifumiStrategy{
    public Attack jouer() {
        Scanner scanner = new Scanner(System.in);
        Attack res;

        System.out.println("Choissez l'attaque : \n" +
                "1 : Pierre\n" +
                "2 : Feuille\n" +
                "3 : Ciseaux\n"
                );
        switch(scanner.next().charAt(0)) {
            case 1 :
                res = Attack.PIERRE;
                break;
            case 2 :
                res = Attack.FEUILLE;
                break;
            case 3 :
                res = Attack.CISEAUX;
                break;
            default :
                throw new IllegalArgumentException();
        }
        return res;
    }
}
