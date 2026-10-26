package decorator;

import composite.Commande;
import composite.Menu;
import composite.Muffin;

public class Test {
    public static void main(String[] args) {
        Muffin muffin = new Muffin();
        Boisson boissonChocolatee = new BoissonChocolatee();
        Cafe cafe1 = new Cafe();
        Cafe cafe2 = new Cafe();

        MokaDecorator moka1 = new MokaDecorator(cafe1);
        MokaDecorator moka2  = new MokaDecorator(moka1);

        SojaDecorator soja = new SojaDecorator(cafe2);
        MilkDecorator milk = new MilkDecorator(soja);


        Menu menu = new Menu(boissonChocolatee, muffin);

        Commande commande = new Commande();
        commande.add(menu);
        commande.add(moka2);
        commande.add(milk);

        System.out.println(commande.toString());
    }
}
