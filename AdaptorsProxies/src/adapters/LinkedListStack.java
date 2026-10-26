package adapters;

import java.util.LinkedList;

public class LinkedListStack implements Stack {
    private LinkedList<Object> linkedList;

    public LinkedListStack(LinkedList<Object> linkedList) {
        this.linkedList = linkedList;
    }


    @Override
    public void push(Object o) {
        linkedList.push(o);
    }

    @Override
    public Object pop() {
        return linkedList.pop();
    }

    @Override
    public Object top() {
        return linkedList.getFirst();
    }
}
