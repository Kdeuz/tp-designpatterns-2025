package src.tree.iterators;

import src.tree.Tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class InfixIterator<V> implements Iterator<V> {
    private Tree<V> next;

    public InfixIterator(Tree<V> root) {
        while(root.getParent()!=null) {
            root = root.getParent();
        }
        this.next = leftMost(root);
    }

    public Tree<V> leftMost(Tree<V> root) {
        if(root==null) {
            return null;
        }
        while(root.getLeft()!=null) {
            root = root.getLeft();
        }

        return root;
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

        Tree<V> nodeToReturn = this.next;

        if(next.getRight()!=null) {
            next = leftMost(nodeToReturn.getRight());
        } else {
            Tree<V> parent = nodeToReturn.getParent();

            while(parent!=null && nodeToReturn == parent.getRight()) {
                nodeToReturn = parent;
                parent = nodeToReturn.getParent();
            }

            this.next = parent;
        }

        return nodeToReturn.getValue();
    }
}
