package edu.touro.mcon264.apps.collections;

import edu.touro.mcon264.support.LLNode;

import java.util.Iterator;

public class IterableLinkedCollection <T> extends LinkedCollection<T> implements IterableCollection<T> {

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private LLNode<T> current = IterableLinkedCollection.this.head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (current == null) throw new java.util.NoSuchElementException();
                T val = current.getInfo();
                current = current.getLink();
                return val;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
