package decorator;

import composite.Order;

public class Beverage extends Order {
    public Beverage(String name, double price) {
        super(name, price);
    }
}
