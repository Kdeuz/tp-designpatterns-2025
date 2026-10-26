package adapters;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIterator implements Iterator<Object> {

    private Enumeration<Object> adaptee;

    public EnumerationIterator(Enumeration<Object> adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean hasNext() {
        return adaptee.hasMoreElements();
    }

    @Override
    public Object next() {
        return adaptee.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
