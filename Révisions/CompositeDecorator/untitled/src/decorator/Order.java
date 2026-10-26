package decorator;

public class Order {
    protected String name;
    protected double price;

    public Order() {}

    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return (double)Math.round(price*100)/100;
    }

    public void add(Order o) {
        throw new UnsupportedOperationException();
    }

    public void remove(Order o) {
        throw new UnsupportedOperationException();
    }

    public Order getChild(int i)  {
        throw new UnsupportedOperationException();
    }

    public void print() {
        System.out.println("- " + this.toString() + " : " + this.getPrice());
    }

    public String toString() {
        return this.name;
    }


}
