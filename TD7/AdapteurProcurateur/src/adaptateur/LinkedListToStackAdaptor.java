package adaptateur;

import java.util.LinkedList;

public class LinkedListToStackAdaptor implements Stack {
    private LinkedList<Object> linkedList;
    public LinkedListToStackAdaptor(LinkedList<Object> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void push(Object o) {
        linkedList.addFirst(o);
    }

    @Override
    public Object pop() {
        return this.linkedList.removeFirst();
    }

    @Override
    public Object top() {
        return this.linkedList.getFirst();
    }
}
