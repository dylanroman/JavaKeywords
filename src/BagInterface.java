//
// Name: Roman, Dylan
// Project: 1
// Due: 9-18-2025
// Course: cs-2400-03-f25
//
// Description:
// Template for Bag ADT. Bag is an unordered collection of entries which allows duplicates.
//


public interface BagInterface<T> {
    /** Gets the number of entries in the bag as an int.
     * @return Number of entries in the bag. */
    public int getCurrentSize();

    /** Checks if the bag has entries or not.
     * @return True if bag contains no entries. */
    public boolean isEmpty();

    /** Adds an entry to the bag and notifies user if addition was successful or not.
     * @param item Data to be added to bag.
     * @return True if entry is inserted into bag. */
    public boolean add(T item);

    /** Removes an entry from the bag and returns its value.
     * @return Entry removed from bag. */
    public T remove();

    /** Searches bag for specific entry, removes first entry of entry if it is found.
     * @param anEntry Data to be removed from bag.
     * @return True if entry is removed from bag, False if item was not found. */
    public boolean remove(T anEntry);

    /** Removes all entries from bag. */
    public void clear();

    /** Finds the number of occurrences a given entry has within the bag. Returns result as an int.
     * @param anEntry Data to be counted.
     * @return Number of times anEntry appears in bag. */
    public int getFrequencyOf(T anEntry);

    /** Checks if bag contains a given entry.
     * @return Boolean if bag contains specific entry. */
    public boolean contains(T anEntry);

    /** Retrieves all entries in bag and puts them into a new array.
     * @return Newly allocated array containing all entries in bag. */
    T[] toArray();

}