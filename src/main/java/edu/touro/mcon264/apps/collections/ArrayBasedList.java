package edu.touro.mcon264.apps.collections;

import java.util.Iterator;

public class ArrayBasedList <T> extends ArrayCollection<T> implements ListInterface<T>{
    private void indexChecker(int index) {
        if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numElements);
        }
    }
    @Override
    public void add(int index, T element) {
        this.elements[index] = element;
    }

    @Override
    public T get(int index) {
        indexChecker(index);
        return elements[index];
    }

    @Override
    public T remove(int index) {
        indexChecker(index);
        T removedElement = elements[index];
        remove(removedElement);
        return removedElement;
    }

    @Override
    public int indexOf(T target) {
        find(target);
        if (found) {
            return location;
        } else {
            return -1;
        }
    }

    @Override
    public boolean set(int index, T element) {
        indexChecker(index);
        elements[index] = element;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < numElements;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return elements[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }
}
