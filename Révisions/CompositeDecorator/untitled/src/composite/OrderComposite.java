package composite;

import java.util.ArrayList;
import java.util.List;

public class OrderComposite extends Order{
    protected List<Order> children;

    public OrderComposite() {
        children = new ArrayList<>();
    }

    public OrderComposite(List<Order> children) {
        this.children = children;
    }

    public void add(Order o) {
        children.add(o);
    }

    public void remove(Order o) {
        children.remove(o);
    }

    public Order getChild(int i) {
        return children.get(i);
    }

    public double getPrice() {
        double total = 0.0;
        for(Order o : this.children) {
            total += o.getPrice();
        }

        return (double) Math.round(total * 100) /100;
    }

    public void print() {
        for(Order o : children) {
            System.out.println("- " + o.toString() + " : " + o.getPrice());
        }
        System.out.println("Total : " + getPrice());
    }

}
