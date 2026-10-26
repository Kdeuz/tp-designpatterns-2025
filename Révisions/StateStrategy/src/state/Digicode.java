package state;

import java.util.Scanner;

public class Digicode {
    private DigicodeState state;
//    private String password;

    public Digicode() {
        this.state = new DigicodeState0();
    }

    public DigicodeState getState() {
        return this.state;
    }

    public void setState(DigicodeState state) {
        this.state = state;
    }

    public void appuyer(char c) {
        this.state.handle(this, c);


//        if(state.equals(State.START)) {
//            if(c == password.charAt(0)) {
//                System.out.println("Passage à l'état 0");
//                state = State.STATE0;
//            } else {
//                System.out.println("Mauvais mdp");
//                state = State.NOTOK;
//            }
//        } else if(state.equals(State.STATE0)) {
//            if(c == password.charAt(1)) {
//                System.out.println("Passage à l'état 1");
//                state = State.STATE1;
//            } else {
//                System.out.println("Mauvais mdp");
//                state = State.NOTOK;
//            }
//        } else if(state.equals(State.STATE1)) {
//            if(c == password.charAt(2)) {
//                System.out.println("Passage à l'état 2");
//                state = State.STATE2;
//            } else {
//                System.out.println("Mauvais mdp");
//                state = State.NOTOK;
//            }
//        } else if(state.equals(State.STATE2)) {
//            if(c == password.charAt(3)) {
//                System.out.println("Passage à l'état 3, ouverture...");
//                state = State.STATE3;
//            } else {
//                System.out.println("Mauvais mdp");
//                state = State.NOTOK;
//            }
//        } else if(state.equals(State.STATE3)) {
//            System.out.println("La porte est ouverte...");
//        } else {
//            System.out.println("Mauvais mdp");
//        }



    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) throws InterruptedException {
//            Digicode digicode = new Digicode();
//            Scanner scanner = new Scanner(System.in);
//            char c;
//            while(digicode.getState()!=State.STATE3 && digicode.getState()!=State.NOTOK) {
//                System.out.println("Entrez le char suivant du mdp :");
//                c = scanner.next().charAt(0);
//                digicode.appuyer(c);
//            }

            Digicode digicode = new Digicode();
            Scanner scanner = new Scanner(System.in);
            char c;

            while(digicode.getState().getClass()!= DigicodeStateFinal.class && digicode.getState().getClass()!=DigicodeStateNotOk.class) {
                System.out.println("Entrez le caractère suivant du mdp");
                c = scanner.next().charAt(0);
                digicode.appuyer(c);
            }

        }
    }
}
//Le problème est que si je veux changer de mot de passe, je dois changer le champs "password".
//De plus, si je veux changer de taille de mdp, je dois ajouter ou enlever des "if-else"