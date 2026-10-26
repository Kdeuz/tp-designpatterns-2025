package adaptateur;

import java.util.Set;

public class IntSetToPriorityQueue implements PriorityQueue {
    private Set<Integer> integerSet;

    public IntSetToPriorityQueue(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }


    @Override
    public void add(Object o) {
        if(o instanceof Integer i)
            this.integerSet.add(i);
        else
            throw new IllegalArgumentException("Que des int");
    }

    @Override
    public int size() {
        return this.integerSet.size();
    }

    @Override
    public Object removeSmallest() {
        int min = Integer.MAX_VALUE;
        if(!this.integerSet.isEmpty()) {
            for (int n : this.integerSet) {
                if (n < min) {
                    min = n;
                }
            }
            return min;
        }
        throw new UnsupportedOperationException("L'ensemble d'entiers n'est pas initialisé");
    }
}
