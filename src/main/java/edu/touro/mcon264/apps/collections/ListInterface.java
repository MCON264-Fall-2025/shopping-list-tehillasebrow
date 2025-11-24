package edu.touro.mcon264.apps.collections;

public interface ListInterface<T> extends IterableCollection <T> {
    void add(int index, T element)throws IndexOutOfBoundsException;
    // Inserts the specified element at the specified position in this list.
    // Shifts the element currently at that position (if any) and any subsequent
    // elements to the right (adds one to their indices).

    T get(int index) throws IndexOutOfBoundsException;
    // Returns the element at the specified position in this list.

    T remove(int index) throws IndexOutOfBoundsException;
    // Removes the element at the specified position in this list.
    // Shifts any subsequent elements to the left (subtracts one from their indices).
    // Returns the element that was removed from the list.

    int indexOf(T target)  ;
    // Returns the index of the first occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.

    boolean set(int index, T element) throws IndexOutOfBoundsException;
    // Replaces the element at the specified position in this list with the
    // specified element. Returns true if successful, false otherwise.
}
