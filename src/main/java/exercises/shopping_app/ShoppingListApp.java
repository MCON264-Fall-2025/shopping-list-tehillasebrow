package exercises.shopping_app;

import edu.touro.mcon264.apps.collections.ListInterface;

/**
 * Creates a ListInterface<ShoppingItem> instance.
 * Has a main method that runs a console application.
 * Provides a simple text-based menu to:
 * Add items (in sorted order).
 * View the current list.
 * “Shop” the next item on the list.
 * Exit the program.
 */
public class ShoppingListApp {
    public static void main(String[] args) {
        //TODO
    }
    /**
     * Inserts the given item into the list so that the list remains sorted
     * by aisle and then item name.
     */
    public static void insertSorted(ListInterface<ShoppingItem> list, ShoppingItem item) {
        // TODO: implement using list.get(i), list.add(i, item), list.size()
    }
    /**
     * Returns the "next" item to shop and removes it from the list.
     * If the list is empty, returns null.
     */
    public static ShoppingItem shopNext(ListInterface<ShoppingItem> list) {
        // TODO: implement using ListInterface methods
        return null;
    }


}
