public class LinkedBag<T> implements BagInterface<T>{

    // Inner class only accessible by LinkedBag implementation. Stores data and next element in list.
    private class Node {
        private T data;
        private Node next;

        private Node (T data) {
            this(data, null);
        }

        private Node (T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(T item) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}
