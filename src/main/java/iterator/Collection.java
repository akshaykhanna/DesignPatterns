package iterator;

public interface Collection {
    Iterator createIterator();

    void add(Item item);
}
