package decorator;

public class BoissonDecorator extends Boisson{
    private Boisson boisson;
    private double prix;

    public BoissonDecorator(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    public double prix() {
        return boisson.prix() + this.prix;
    }
}
