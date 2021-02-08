package com.marsaint.arshiva;

import java.util.*;

public class StockList {

    private Map<String, StockItem> itemList;

    public StockList() {
        this.itemList = new TreeMap<>();
    }

    public Map<String, StockItem> getItemList() {
        return itemList;
    }

    public int addStock(StockItem item) {
        if (item != null) {
            System.out.println("item not null, process checking...");
//            StockItem newItem = itemList.get(item);
//            StockItem itemInStock = itemList.getOrDefault(item.getName(), item);

            StockItem itemInStock = itemList.get(item.getName());
            System.out.println("check if current newItem is already in stock: " + itemInStock + " in stock");

            if (itemInStock != null) {
                System.out.println("item found, already in stock, process to adjust quantity...");
                item.adjustStock(itemInStock.availableQuantity());
                System.out.println(item.getName() + " quantity is now: " + item.availableQuantity());
            } else {
                // else if itemInStock == null
                System.out.println("item not found in stock, add new item into stock");
                itemList.put(item.getName(), item);
                System.out.println(item.getName() + ": " + item.availableQuantity() + " add into stock");
            }
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String itemName, int quantity) {
        StockItem inStock = itemList.getOrDefault(itemName, null);

        if ((inStock != null) && (inStock.availableQuantity() > quantity) && (quantity > 0)) {
            System.out.println("sellStock: " + quantity);
            inStock.adjustStock(-quantity);
            return quantity;
        }
        System.out.println("error");
        return 0;
    }

    //getter to check stock by name
    public StockItem get(String key) {
        return itemList.get(key);
    }


    public Map<String, Double> priceList() {

        Map<String, Double> prices = new LinkedHashMap<>();

        for (Map.Entry<String, StockItem> item : itemList.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }


    public Map<String, StockItem> readOnlyItemList() {
        return Collections.unmodifiableMap(itemList);
    }

    @Override
    public String toString() {
//        return super.toString();
        String s = "\n Stock List: \n";
        double totalCost = 0.0;

        for (Map.Entry<String, StockItem> itemEntry : itemList.entrySet()) {

            StockItem stockItem = itemEntry.getValue(); // get StockItem our from <String : StockItem>

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + "\n item total value: " + itemValue + "\n";

            totalCost += itemValue;
        }
        s = s + "\n" + "+++ " + "total stock value is: " + totalCost + " +++";
        return s;
    }




}
