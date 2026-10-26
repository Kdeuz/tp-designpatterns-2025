package composite;

import java.util.ArrayList;
import java.util.List;

public class Commande extends Produit{
    private List<Produit> produits;

    public Commande() {
        super();
        produits = new ArrayList<>();


    };

    @Override
    public double prix() {
        double calculPrix = 0;
        for(Produit p : produits) {
            calculPrix += p.prix();
        }
        return calculPrix;
    }

    public void add(Produit produit) {
        if(!(produits == null)) {
            produits.add(produit);
        }
        else {
            produits = new ArrayList<>();
            produits.add(produit);
        }
    }

    public void remove(Produit produit) {
        if(!(produits == null)) {
            produits.remove(produit);
        }
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Produit p : produits) {
            if(p instanceof Commande commande) {
                s.append(commande.toString()).append("\n");
            } else {
                s.append("- ").append(p.getNom()).append(" : ").append(p.prix()).append("\n");
            }
        }
        s.append("Total : ").append(this.prix());
        return s.toString();
    }




}
