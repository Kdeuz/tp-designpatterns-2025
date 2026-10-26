package tree.iterator;

import tree.Tree;

import java.util.Iterator;

public class PreOrderIterator<V> implements Iterator<V> {

    private Tree<V> next;

    public PreOrderIterator(Tree<V> root) {
        Tree<V> child;

        if(root == null) {
            next = null;
            return;
        }

        if(root.getParent() != null) {
            next = root;
            while(next.getParent()!=null) {
                next = next.getParent();
            }
        }
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public V next() {
        if(!hasNext()) {
            try {
                throw new NoSuchFieldException();
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }

        Tree<V> current = next;
        if(next.getLeft() != null) {
            next = next.getLeft();
        } else {
            if(next.getRight() != null) {
                next = next.getRight();
            } else {
                if(next.getParent() == null) {
                    next = null;
                } else {
                    Tree<V> child = next;
                    boolean rightIsChild = true;
                    while(next.getParent()!= null && next.getRight() == null && rightIsChild) {
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
        }
        return current.getValue();
    }
}
