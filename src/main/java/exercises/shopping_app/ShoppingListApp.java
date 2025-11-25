package exercises.shopping_app;

import edu.touro.mcon264.apps.collections.ArrayBasedList;
import edu.touro.mcon264.apps.collections.ListInterface;

import java.util.Iterator;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        // Choose implementation:
        ListInterface<ShoppingItem> shoppingList = new ArrayBasedList<>();


        boolean running = true;

        while (running) {
            System.out.println("1. Add item");
            System.out.println("2. View list");
            System.out.println("3. Shop next item");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter aisle: ");
                    String aisle = scanner.nextLine().trim();
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine().trim();
                    ShoppingItem newItem = new ShoppingItem(aisle, name);
                    insertSorted(shoppingList, newItem);
                    System.out.println("Added: " + newItem);
                    break;
                case "2":
                    System.out.println("Current shopping list:");
                    printList(shoppingList);
                    break;
                case "3":
                    ShoppingItem next = shopNext(shoppingList);
                    if (next == null) {
                        System.out.println("All done! No items left to shop.");
                    } else {
                        System.out.println("Next item to buy: " + next);
                    }
                    break;
                case "0":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Unknown option. Please try again.");
            }

            System.out.println();
        }
    }

    /**
     * Inserts the given item into the list so that the list remains sorted
     * by aisle and then item name.
     */
    public static void insertSorted(ListInterface<ShoppingItem> list, ShoppingItem item) {
        // TODO: implement using list.get(i), list.add(i, item), list.size()
        for (int i = 0; i < list.size(); i++) {
            ShoppingItem current = list.get(i);
            if (item.compareTo(current) < 0) {
                list.add(i, item);
                return;
            }

        }
        list.add(list.size(), item);
    }

    /**
     * Returns the "next" item to shop and removes it from the list.
     * If the list is empty, returns null.
     */
    public static ShoppingItem shopNext(ListInterface<ShoppingItem> list) {
        // TODO: implement using ListInterface methods

        if (list.isEmpty()) {
            return null;
        } else{
            ShoppingItem next = list.get(0);
            next = list.get(0);
            list.remove(0);
            return next;

        }

    }
    private static void printList(ListInterface<ShoppingItem> list) {
        int index = 0;
        Iterator<ShoppingItem> iterator = list.iterator();
        while (iterator.hasNext()) {
            ShoppingItem item = (ShoppingItem) iterator.next();
            System.out.println(index + ": " + item);
            index++;
        }
    }

}
