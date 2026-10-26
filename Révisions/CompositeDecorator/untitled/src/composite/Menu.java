package composite;

public class Menu extends Order{
    private Beverage b;
    private Food f;
    public Menu(Beverage b, Food f) {
        this.b = b;
        this.f = f;

        this.name = "menu : (" + b.name + " + " + f.name + ")";
        this.price = 0.90*(b.price+f.price);
    }
}
