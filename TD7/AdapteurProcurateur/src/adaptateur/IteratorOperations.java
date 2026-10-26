package adaptateur;

import java.util.Iterator;

public class IteratorOperations {

    public static void displayStrings(Iterator<Object> iterator) {
        while(iterator.hasNext()) {
            Object o = iterator.next();
            if(o instanceof String) {
                System.out.println(o);
            }
        }
    }
}
// Il n'est pas possible d'utiliser la méthode définie précédemment pour avec un objet de type Enumeration sans modifier la méthode ni les interface Enumeration et Iterator car Enumeration n'implémente pas la même interface de Iterator.