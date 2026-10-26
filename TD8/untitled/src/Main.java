import digicode.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Digicode1 d = new Digicode1();
        Scanner scanner = new Scanner(System.in);
//
//        while(!(d.getState().equals(Digicode1States.NOTOKSTATE)) && !(d.getState().equals(Digicode1States.FINALSTATE))) {
//            System.out.println("Entrez la touche suivante : ");
//            d.appuyer(scanner.next().charAt(0));
//        }

        //Les inconvénients de cette solution :
        // Le code est redondant et si on change le code on doit encore remodifier la classe digicode et ajouter une nouvelle condition



        Digicode digicode = new Digicode();

        while(!(digicode.getState() instanceof DigicodeStateFinal) && !(digicode.getState() instanceof DigicodeStateNotOk)){
            System.out.println("Entrez le caractère suivant");
            digicode.appuyer(scanner.next().charAt(0));
        }
    }
}
