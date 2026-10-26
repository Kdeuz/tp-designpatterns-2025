package src.tree.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import src.tree.Tree;


public class PrefixIterator<V> implements Iterator<V> {
    private Tree<V> next;


    public PrefixIterator(Tree<V> root) {
        if(root == null) {
            next = null;
        } else {
            if(root.getParent() != null) {
                next = root;
                while(next.getParent()!=null) {
                    next = next.getParent();
                }
            }
        }


    }


    @Override
    public boolean hasNext() {
        return next!=null;
    }

    @Override
    public V next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        Tree<V> current = next;
        if(next.getLeft()!=null) {
            next=next.getLeft();
        } else {
            if(next.getParent()==null) {
                next = null;
            } else {
                Tree <V> child = next;
                boolean rightIsChild = true;
                while(next.getParent()!=null && next.getRight()==null && rightIsChild) {
                    next = next.getParent();
                    if(next.getRight() != child) {
                        rightIsChild = false;
                        next = next.getRight();
                    } else {
                        child = next;
                    }
                }
            }
        }
        return current.getValue();
    }
}

















































