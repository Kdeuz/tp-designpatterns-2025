package composite;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Cafe cafe2 = new Cafe();
        Menu menu = new Menu(new Chocolat(),new Muffin());

        (new OrderComposite(Arrays.asList(menu, cafe, cafe2))).print();
    }
}
