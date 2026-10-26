package decorator;

public class MilkDecorator extends BoissonDecorator{
    private final double prix = 0.20;

    public MilkDecorator(Boisson boisson) {
        super(boisson);
        this.nom = this.nom + ", milk";
    }
}
