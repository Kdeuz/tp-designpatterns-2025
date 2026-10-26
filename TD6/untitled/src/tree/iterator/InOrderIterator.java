package tree.iterator;

import tree.Tree;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class InOrderIterator<V> implements Iterator<V> {

    private Tree<V> next;
    public InOrderIterator(Tree<V> root) {
        if(root == null){
            next=null;
            return;
        }
        while(root.getLeft() != null) {
            root = root.getLeft();
        }
        next = root;
    }


    @Override
    public boolean hasNext() {
        return this.next != null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public V next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        Tree<V> current = this.next;

        if(next.getRight()!=null) {
            next = next.getRight();
            boolean hasLeft = true;
            while(next.getLeft() != null) {
                next = next.getLeft();
            }

        } else {
            Tree<V> child = next;
            next = next.getParent();
            while(next != null && child == next.getRight()) {
                child = next;
                next = next.getParent();
            }

        }
        return current.getValue();
    }
}
