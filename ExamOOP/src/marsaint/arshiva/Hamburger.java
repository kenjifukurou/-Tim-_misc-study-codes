package marsaint.arshiva;

public class Hamburger {

    private String name;
    private String Meat;
    private String Bread;
    private int price;

    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    // item: basic hamburger and total price
    public Hamburger(String meat, String bread, int price) {
        this.name = "Basic Hamburger";
        Meat = meat;
        Bread = bread;
        this.price = price;
    }

    // items: add additions
    public void additionHamburger1() {
        this.addition1 = "Sausage";
        this.addition1Price = 2.5;
    }
    public void additionHamburger2() {
        this.addition2 = "Beef";
        this.addition2Price = 3;
    }
    public void additionHamburger3() {
        this.addition3 = "French Fries";
        this.addition3Price = 3;
    }
    public void additionHamburger4() {
        this.addition4 = "Coke";
        this.addition4Price = 1.5;
    }

    // calculation hamburger + addition
    public double itemizeHamburgerPrice() {
        double totalPrice = this.price;
        if (addition1 != null) {
            System.out.println("add addition 1");
            totalPrice += addition1Price;
            System.out.println(addition1 + ", price: " + addition1Price);
        }
        if (addition2 != null) {
            System.out.println("add addition 2");
            totalPrice += addition2Price;
            System.out.println(addition2 + ", price: " + addition2Price);
        }
        if (addition3 != null) {
            System.out.println("add addition 3");
            totalPrice += addition3Price;
            System.out.println(addition3 + ", price: " + addition3Price);
        }
        if (addition4 != null) {
            System.out.println("add addition 4");
            totalPrice += addition4Price;
            System.out.println(addition4 + ", price: " + addition4Price);
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return Meat;
    }

    public String getBread() {
        return Bread;
    }

    public int getPrice() {
        return price;
    }
}
