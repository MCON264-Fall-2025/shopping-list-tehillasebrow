package edu.touro.mcon264.apps.collections;


/**
 * Advance Set Interface
 * @param <T>
 */
public interface AdvancedSetInterface<T> extends IterableCollection<T> {
    AdvancedSetInterface<T> union (AdvancedSetInterface<T> otherSet);
    AdvancedSetInterface<T> intersection (AdvancedSetInterface<T> otherSet);
    AdvancedSetInterface<T> difference (AdvancedSetInterface<T> otherSet);
}
