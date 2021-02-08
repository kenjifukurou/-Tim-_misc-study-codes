package com.marsaint.arshiva;

public class StockItem implements Comparable<StockItem> {

    private String name;
    private double price;
    private int stockQuantity;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.stockQuantity = 0;
    }

    public StockItem(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return stockQuantity - reserved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
//        this.price = price;
        if (price <= 0) {
            System.out.println("price cannot be 0 or negative");
        } else if (price > 0) {
            this.price = price;
        }
    }

//    public void setStockQuantity(int stockQuantity) {
//        this.stockQuantity = stockQuantity;
//    }

    public void adjustStock(int quantity) {
//        this.stockQuantity = this.stockQuantity + quantity;
        int newQuantity = this.stockQuantity + quantity;
        if (newQuantity < 0) {
            System.out.println("stock is negative!");
            this.stockQuantity = newQuantity;
        } else if (newQuantity >= 0) {
            System.out.println("adjustStock updated");
            this.stockQuantity = newQuantity;
        }
    }

    public int reserveStock(int quantity) {
        if (quantity <= availableQuantity()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finalizeStock(int quantity) {
        if (quantity <= reserved) {
            stockQuantity -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (this == obj) {
            System.out.println("same obj with StockItem");
            return true;
        }
        if (obj == null) {
            System.out.println("obj is null!");
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            System.out.println("Class is different!");
            return false;
        }
        // compare name
        String objName = ((StockItem)obj).getName();
        boolean b = this.name.equals(objName);
        return  b;

    }

    @Override
    public int hashCode() {
        return this.name.hashCode(); // check name, not object
    }

    @Override
    public int compareTo(StockItem o) {
//        return 0;
        System.out.println("implements compareTo");
        if (this == o) {
            System.out.println("compareTo: same object");
            return 0;
        }

        if (o != null) {
            System.out.println("compareTo: name");
            int i = this.name.compareTo(o.getName());
            return i;
        }
        // if object is null
        throw new NullPointerException();

    }

    @Override
    public String toString() {
        return this.name + ": " + this.price + ", stock: " + this.stockQuantity + "\n" +
                ". Reserved: " + this.reserved;
    }
}
