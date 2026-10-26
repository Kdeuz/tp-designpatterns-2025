package strategy;

import java.util.Scanner;

public class StratChoice implements Strat{
    @Override
    public Attack getAttack() {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Choisissez votre attaque :\n" +
                "0. Pierre\n" +
                "1. Feuille\n" +
                "2. Ciseaux");
        i = scanner.nextInt();

        switch(i) {
            case(0) :
                return Attack.PIERRE;

            case(1) :
                return Attack.FEUILLE;

            case(2) :
                return Attack.CISEAUX;

            default :
                throw new IllegalArgumentException();
        }

    }
}
