package com.marsaint.arshiva;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private String name;
    private Map<StockItem, Integer> basketList;

    public Basket(String name) {
        this.name = name;
        this.basketList = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<StockItem, Integer> getBasketList() {
        return basketList;
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int itemInBasket = basketList.getOrDefault(item, 0);
            System.out.println("add item: + " + item.getName() + "quantity: " + quantity + " into basket");
            basketList.put(item, itemInBasket + quantity);

            System.out.println("itemInBasket: " + itemInBasket + " quantity: " + quantity);
            return itemInBasket;
        }
        return 0;
    }

    //read only list
    public Map<StockItem, Integer> readOnlyList() {
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
//        return super.toString();
        String s = "";
        s = "Shopping basket " + name + " contains " + basketList.size() +
                ((basketList.size() == 1) ? " item" : " items.") + "\n";
        double totalCost = 0.0;

        for (Map.Entry<StockItem, Integer> itemEntry : basketList.entrySet()) {
            String itemS = itemEntry.getKey() + ": " + itemEntry.getValue() + " purchased \n";
            s = s + itemS;

            totalCost += itemEntry.getKey().getPrice() * itemEntry.getValue();
        }
        s = s + "total cost of all items: " + totalCost;
        return s;
    }
}
