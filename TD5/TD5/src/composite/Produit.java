package composite;

import java.util.List;

public abstract class Produit {
    protected double prix;
    protected String nom;

    public Produit(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public Produit(String nom) {
        this.nom = nom;
    }

    public Produit() {
        double prix = 0;
        String nom = "";
    }


    public double prix() {
        return this.prix;
    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public String toString() {
        return "C'est un " + nom + " qui coûte " + prix + " euros.";
    }
}
