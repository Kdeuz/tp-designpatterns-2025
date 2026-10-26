package decorator;

public class MokaDecorator extends BoissonDecorator{
    private final double prix = 0.30;


    public MokaDecorator(Boisson boisson) {
        super(boisson);
        this.nom = this.nom + ", moka";
    }
}
