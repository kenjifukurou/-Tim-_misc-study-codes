package com.marsaint.arshiva;

import java.util.*;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 3);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.readOnlyItemList().keySet()) {
            System.out.println(s);
        }

        System.out.println("========== ========== ========== ========== ");

        Basket basket = new Basket("'Fuck you Tim'");
        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        System.out.println(basket);

        System.out.println("========== no more car ========== ");

        if (sellItem(basket, "car", 1) != 1) {
            System.out.println("no more car");
        }

        System.out.println("========== no more car ========== ");

        sellItem(basket, "cake", 1);
        sellItem(basket, "cake", 1);
        System.out.println(basket);

        sellItem(basket, "spanner", 5);
        sellItem(basket, "juice", 4);
        sellItem(basket, "cup", 12);
        sellItem(basket, "bread", 1);

        System.out.println(stockList);
        System.out.println(basket);

        System.out.println("========== ========== ========== ========== ");

        for (Map.Entry<String, Double> price: stockList.priceList().entrySet()) {
            System.out.println(price.getKey() + " cost " + price.getValue());
        }

        System.out.println("========== ========== ========== ========== ");


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("we don't sell: " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

}
