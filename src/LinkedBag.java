//
// Name: Roman, Dylan
// Project: 1
// Due: 9-12-2025
// Course: cs-2400-03-f25
//
// Description:
// Implementation of LinkedBag. Uses singly linked list to store data in bag.
//

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
    int size;

    public LinkedBag() {
        this.head = null;
        this.size = 0;
    }

    // Private helper method. If value is found, returns node containing value. If value is not found, returns null;
    private Node getReferenceTo (T value) {
       boolean found = false;
       Node current = head;

       while (!found && current != null) {
           if (current.data.equals(value)) {
               found =  true;
           } else {
               current = current.next;
           }
       }

       return current;
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean add(T item) {
        head = new Node(item, head);
        size++;
        return true;
    }

    @Override
    public T remove() {
         T output = head.data;
         if (output != null) {
             head.data = null;
             head = head.next;
         }

         return output;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @Override
    public void clear() {
        while(head != null) {
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return getReferenceTo(anEntry) != null;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] output = (T[]) new Object[size];

        // Current location
        Node current = head;
        int index = 0;

        return output;
    }
}
