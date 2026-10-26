package adapters;

public interface PriorityQueue {
    void add(Object o);
    int size();
    Object removeSmallest();
}
