package marsaint.arshiva;

public class HealthyBurger extends Hamburger {

    private String healthyAddition1;
    private double healthyAddition1Price;
    private String healthyAddition2;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, int price) {
        super(meat, "brown", price);
    }

    public void addHealthyAddition1() {
        this.healthyAddition1 = "Healthy A";
        this.healthyAddition1Price = 3;
    }

    public void addHealthyAddition2() {
        this.healthyAddition2 = "Healthy B";
        this.healthyAddition2Price = 3.5;
    }

    @Override
    public double itemizeHamburgerPrice() {
        double totalPrice = super.getPrice();
        if (healthyAddition1 != null) {
            System.out.println("add healthy addition 1, price: " + healthyAddition1Price);
            totalPrice += healthyAddition1Price;
        }
        if (healthyAddition2 != null) {
            System.out.println("add healthy addition 2, price " + healthyAddition2Price);
            totalPrice += healthyAddition2Price;
        }
        return totalPrice;
    }
}
