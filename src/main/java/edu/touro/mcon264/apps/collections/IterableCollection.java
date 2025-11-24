package edu.touro.mcon264.apps.collections;

public interface IterableCollection<T> extends CollectionInterface<T> {
    java.util.Iterator<T> iterator();
}
