//
// Name: Roman, Dylan
// Project: 1
// Due: 9-18-2025
// Course: cs-2400-03-f25
//
// Description:
// Template for Bag ADT. Bag is an unordered collection of elements which allows duplicates.
//


public interface BagInterface<T> {
    /**
     * @return number of elements in the bag
     */
    public int getCurrentSize();

    /**
     * @return true if bag contains no elements
     */
    public boolean isEmpty();

    /**
     * Adds an element to the bag
     * @return true if element is inserted into bag
     */
    public boolean add(T item);

    /**
     * Removes an element from the bag
     * @return element removed from bag
     */
    public T remove();

    /**
     * Searches bag for specific element, removes element if it is found.
     * @return true if element is removed from bag
     */
    public boolean remove(T anEntry);

    /**
     * Removes all elements from bag
     */
    public void clear();

    /**
     * @return number of times an element appears in bag
     */
    public int getFrequencyOf(T anEntry);

    /**
     * @return boolean if bag contains specific element
     */
    public boolean contains(T anEntry);

    /**
     * @return array containing all elements of bag
     */
    public T[] toArray();

}