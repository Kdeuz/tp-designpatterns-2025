package adapters;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class SetPriorityQueue implements PriorityQueue {
    private Set<Integer> adaptee;

    public SetPriorityQueue(Set<Integer> set) {
        this.adaptee = set;
    }


    @Override
    public void add(Object o) {
        if(o instanceof Integer i) {
            adaptee.add(i);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int size() {
        return adaptee.size();
    }

    @Override
    public Object removeSmallest() {
        if(adaptee.isEmpty()) {
            throw new NoSuchElementException();
        }

        Iterator<Integer> it = adaptee.iterator();
        Integer smallest = it.next();

        while(it.hasNext()) {
            Integer current = it.next();
            if(current < smallest) {
                smallest = current;
            }
        }

        adaptee.remove(smallest);

        return smallest;
    }
}
