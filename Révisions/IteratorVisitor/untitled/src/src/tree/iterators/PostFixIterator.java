package src.tree.iterators;

import src.tree.Tree;

import java.util.Iterator;

public class PostFixIterator<V> implements Iterator<V> {

    private Tree<V> next;

    public PostFixIterator(Tree<V> node) {
        while(node.getParent()!=null) {
            node = node.getParent();
        }
        this.next = findFirstNode(node);
    }

    public Tree<V> findFirstNode(Tree<V> node) {
        if(node == null) {
            return null;
        }

        while(node.getLeft()!=null || node.getRight()!=null) {
            if(node.getLeft()!=null) {
                node=node.getLeft();
            } else {
                node = node.getRight();
            }
        }
        return node;
    }


    @Override
    public boolean hasNext() {
        return next!=null;
    }

    @Override
    public V next() {
        if(next==null) {
            return null;
        }
        Tree<V> nodeToReturn = next;
        Tree<V> parent = next.getParent();
        if(parent!=null) {
            if (parent.getLeft() == next) {
                if (parent.getRight() != null) {
                    next = findFirstNode(parent.getRight());
                } else {
                    next = parent;
                    parent = next.getParent();
                }
            } else {
                next = parent;
            }
        } else {
            next=null;
        }

        return nodeToReturn.getValue();
    }
}
