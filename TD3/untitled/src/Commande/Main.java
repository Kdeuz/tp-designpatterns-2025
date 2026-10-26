package Commande;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int volumeTarget;
        int action; //1 fill, 2 empty, 3 decant
        int bidon; //1 can3, 2 can5
        Scanner input = new Scanner(System.in);
        System.out.println("Combien voulez-vous de litres?");

        volumeTarget = input.nextInt();

        Can can3 = new Can(3);
        Can can5 = new Can(5);

        while(can5.getVolume() != 4) {
            System.out.println("Quelle action faire?\n"
                    + "1/ fill\n"
                    + "2/ empty\n"
                    + "3/ decant\n" +
                    "4/ undo"
            );
            action = input.nextInt();
            switch(action) {
               case 1 :
                   System.out.println("Quel bidon remplir?\n"
                           + "1/ Celui de 3L\n"
                           + "2/ Celui de 5L"
                   );
                   bidon = input.nextInt();

                   switch(bidon) {
                       case 1 :
                           FillCommand fillCommand = new FillCommand(can3);
                           Invoker.storeCommand(fillCommand);
                           break;

                       case 2 :
                           FillCommand fillCommand1 = new FillCommand(can5);
                           Invoker.storeCommand(fillCommand1);
                           break;


                   }
                   break;

               case 2 :
                    System.out.println("Quel bidon vider?\n" +
                            "1/ Celui de 3L\n" +
                            "2/ Celui de 5L"
                    );
                    bidon = input.nextInt();

                    switch(bidon) {
                        case 1 :
                            EmptyCommand emptyCommand = new EmptyCommand(can3);
                            Invoker.storeCommand(emptyCommand);
                            break;

                        case 2 :
                            EmptyCommand emptyCommand1 = new EmptyCommand(can5);
                            Invoker.storeCommand(emptyCommand1);
                            break;
                    }
                    break;

                case 3 :
                    System.out.println("Quel bidon est la source?\n" +
                            "1/Celui de 3L\n" +
                            "2/ Celui de 5L"
                    );

                bidon = input.nextInt();

                switch(bidon) {
                    case 1 :
                        DecantCommand decantCommand = new DecantCommand(can3, can5);
                        Invoker.storeCommand(decantCommand);
                        break;

                    case 2 :
                        DecantCommand decantCommand1 = new DecantCommand(can5, can3);
                        Invoker.storeCommand(decantCommand1);
                        break;
                }

                break;

            case 4 :
                Invoker.undo();
                break;
            }

            System.out.println("Etat courant :\n" +
                    "Volume d'eau du bidon de 3L : " + can3.getVolume() + "\n" +
                    "Volume d'eau du bidon de 5L : " + can5.getVolume()
            );
        }


    }
}