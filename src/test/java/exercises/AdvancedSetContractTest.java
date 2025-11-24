package exercises;

import org.junit.jupiter.api.Test;

/**
 * Contract/compilation tests for the advanced set hierarchy.
 *
 * These do not check behavior; they exist so the project can be compiled and
 * auto-graded once method signatures and implementations are added.
 */
public class AdvancedSetContractTest {

    @Test
    public void canInstantiateAdvancedSetImplementations() {
        AdvanceSetInterface<String> linked = new LinkedListAdvancedSet<>();
        AdvanceSetInterface<String> unsorted = new UnsortedArrayAdvancedSet<>();
        AdvanceSetInterface<Integer> sorted = new SortedArrayAdvancedSet<>();
    }

    @Test
    public void unionIntersectionDifferenceMethodsAreAvailable() {
        AdvanceSetInterface<String> a = new LinkedListAdvancedSet<>();
        AdvanceSetInterface<String> b = new LinkedListAdvancedSet<>();

        // These calls only need to compile to verify that the methods exist
        AdvanceSetInterface<String> union = a.union(b);
        AdvanceSetInterface<String> intersection = a.intersection(b);
        AdvanceSetInterface<String> difference = a.difference(b);

        // Make simple null checks so the variables are used; behavior is up to
        // the concrete implementations and may be tested elsewhere.
        assert union != null;
        assert intersection != null;
        assert difference != null;
    }
}
