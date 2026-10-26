package Command;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Can can1 = new Can(3);
        Can can2 = new Can(5);

        Decant decant1 = new Decant(can1, can2);
        Decant decant2 = new Decant(can2, can1);
        Empty empty1 = new Empty(can1);
        Empty empty2 = new Empty(can2);
        Fill fill1 = new Fill(can1);
        Fill fill2 = new Fill(can2);

        Scanner scanner = new Scanner(System.in);

        while(can1.getVolume()+can2.getVolume() != 4) {
            System.out.println("Svp choisissez une commande : \n" +
                    "1. Decant\n" +
                    "2. Empty\n" +
                    "3. Fill \n");
            int choice = scanner.nextInt();
            int choice2;

            switch(choice) {
                case 1:
                    System.out.println("Quel bidon transvaser dans l'autre? \n" +
                            "1. 1\n" +
                            "2. : 2");
                    choice2 = scanner.nextInt();

                    switch(choice2) {
                        case 1 :
                            invoker.pushCommand(decant1);
                            break;
                        case 2 :
                            invoker.pushCommand(decant2);
                            break;
                        default:
                            throw new IllegalArgumentException("Il n'y a que deux choix");
                    }
                    break;

                case 2:
                    System.out.println("Quel bidon voulez-vous vider? \n" +
                            "1. 1\n" +
                            "2. 2");

                    choice2 = scanner.nextInt();

                    switch(choice2) {
                        case 1:
                            invoker.pushCommand(empty1);
                            break;
                        case 2:
                            invoker.pushCommand(empty2);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;

                case 3:
                    System.out.println("Quel bidon remplir? \n" +
                            "1. 1\n" +
                            "2. 2");

                    choice2 = scanner.nextInt();

                    switch(choice2) {
                        case 1:
                            invoker.pushCommand(fill1);
                            break;

                        case 2 :
                            invoker.pushCommand(fill2);
                            break;

                        default:
                            throw new IllegalArgumentException();
                    }
                    break;

                default:
                    throw new IllegalArgumentException();
            }

            System.out.println("V bidon1 : " + can1.getVolume() + "\n" +
                    "Vbidon2 : " + can2.getVolume());
        }
        invoker.getHistory();
    }
}
