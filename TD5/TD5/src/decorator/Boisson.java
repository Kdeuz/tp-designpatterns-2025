package decorator;

import composite.Produit;

public class Boisson extends Produit {
    public Boisson() {
        super();
    }

    public Boisson(double prix, String nom) {
        super(prix, nom);
    }


}
