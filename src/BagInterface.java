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
    /** Returns the number of entries in the bag as an int.
     * @return number of elements in the bag
     */
    public int getCurrentSize();

    /** Checks if the bag has elements or not.
     * @return true if bag contains no elements
     */
    public boolean isEmpty();

    /** Adds an element to the bag and notifies user if addition was successful or not.
     * @return true if element is inserted into bag
     */
    public boolean add(T item);

    /** Removes an element from the bag and returns its value.
     * @return element removed from bag
     */
    public T remove();

    /** Searches bag for specific element, removes element if it is found.
     * @return true if element is removed from bag
     */
    public boolean remove(T anEntry);

    /** Empties bag.
     * Removes all elements from bag
     */
    public void clear();

    /** Finds the number of occurrences a given entry has within the bag. Returns result as an int.
     * @return number of times an element appears in bag
     */
    public int getFrequencyOf(T anEntry);

    /** Checks if bag contains a given element.
     * @return boolean if bag contains specific element
     */
    public boolean contains(T anEntry);

    /**
     * @return array containing all elements in bag
     */
    T[] toArray();

}