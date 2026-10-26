package composite;

public class Menu extends Produit{
    private Boisson boisson;
    private Encas encas;
    public Menu(Boisson boisson, Encas encas) {
        super("menu (" + boisson.getNom() + " + " + encas.getNom() + ")");
        this.boisson = boisson;
        this.encas = encas;
    }

    public void setBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public void setEncas(Encas encas) {
        this.encas = encas;
    }

    public Boisson getBoisson() {
        return this.boisson;
    }

    public Encas getEncas() {
        return this.encas;
    }

    public double prix() {
        return (this.boisson.prix() + this.encas.prix())*0.90;
    }
}
