package marsaint.arshiva;

import java.util.ArrayList;

public class GroceryItems {

    private ArrayList<String> groceryItems = new ArrayList<String>();

    //can: add, print, set, remove, find items in list

    public void addItem(String item) {
        groceryItems.add(item);
        System.out.println(item + " added");
    }

    public void printAllItem() {
        System.out.println("total have " + groceryItems.size() + " items");
        for (int i = 0; i < groceryItems.size(); i++) {
            System.out.println("item: " + i + " " + groceryItems.get(i));
        }
    }

    public void modifyItem(String currentItem, String newItem) {
        int x = findItem(currentItem);
        modifyItem(x, newItem);
        System.out.println("item: " + currentItem + " has modified to: " + newItem);
    }

    public void modifyItem(int index, String item) {
        groceryItems.set(index, item);
        System.out.println("item: " + index + " has modified to: " + item);
    }

    public void removeItem(String item) {
        int itemIndex = findItem(item);
        removeItem(itemIndex);
    }

    public void removeItem(int index) {
        groceryItems.remove(index);
    }

    public int findItem(String item) {
        int x = groceryItems.indexOf(item);
        if (x < 0) {
            System.out.println("item not in list");
        }
        return x;
    }

    public String searchItem(String item) {
        // indexOf, isEmpty
        int i = groceryItems.indexOf(item);
        if (i >= 0) {
            System.out.println("found item: " + groceryItems.get(i));
            return groceryItems.get(i);
        } else {
            System.out.println("item not found");
            return null;
        }
    }

    public ArrayList<String> getGroceryItems() {
        return groceryItems;
    }
}
