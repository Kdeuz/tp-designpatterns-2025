package composite;

public class Test {
    public static void main(String[] args) {
        Muffin muffin = new Muffin();
        BoissonChocolatee boissonChocolatee = new BoissonChocolatee();
        Cafe cafe1 = new Cafe();
        Cafe cafe2 = new Cafe();

        cafe1.setTrueMoka1();
        cafe1.setTrueMoka2();

        cafe2.setTrueSoja1();
        cafe2.setTrueLait1();

        Menu menu = new Menu(boissonChocolatee, muffin);

        Commande commande = new Commande();
        commande.add(menu);
        commande.add(cafe1);
        commande.add(cafe2);

        System.out.println(commande.toString());
    }
}
