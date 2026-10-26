package adaptateur;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Vector<Object> vector = new Vector<>();
       vector.add("Toto");
       vector.add(42);
       IteratorOperations.displayStrings(new Adaptor<>(vector.elements()));

    }
}