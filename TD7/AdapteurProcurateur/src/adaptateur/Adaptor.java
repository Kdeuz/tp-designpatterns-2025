package adaptateur;

import java.util.Enumeration;
import java.util.Iterator;

public class Adaptor<Object> implements Iterator<Object> {
    private Enumeration<Object> enumeration;

    public Adaptor(Enumeration<Object> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return (Object) enumeration.nextElement();
    }


    //On garde la méthode par défaut :
    //     default void remove() {
    //        throw new UnsupportedOperationException("remove");
    //    }
}
