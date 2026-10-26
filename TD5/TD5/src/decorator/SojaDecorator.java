package decorator;

public class SojaDecorator extends BoissonDecorator{
    private double prix = 0.40;

    public SojaDecorator(Boisson boisson) {
        super(boisson);
        this.nom = this.nom + ", soja";
    }
}
