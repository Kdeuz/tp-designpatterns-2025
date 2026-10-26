package boolexpr;

public interface Node {
    public String getName();
    public boolean evaluate() throws NoSuchFieldException;
}
