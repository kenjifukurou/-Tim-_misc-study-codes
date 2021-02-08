package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        // Bill Burger -> process of selling hamburgers
        // select type of Burgers, and option to add on additional items
        // calculate pricing
        // Base Burger, and 2 more other type of hamburgers
        // basic hamburger: bread roll type, meat, up to 4 additions (lettuce, tomato, carrot, etc)
        // each items is charged accordingly: e.g: basic hamburger (base price) + lettuce + tomato + carrot = final price
        // dead all above in Hamburger class, tip: constructor include: roll type, meat, price
        // 2 more variety of hamburger as sub-class:
        // Healthy hamburger, use brown rye bread roll, 6 additions
        // Deluxe hamburger, come with chips and drinks as additions. but no optional additions
        // all 3 classes have method to show prices and details

        Hamburger myBurger = new Hamburger("beef", "white", 5);
        System.out.println(myBurger.getName());
        System.out.println(myBurger.itemizeHamburgerPrice());
        myBurger.additionHamburger1();
        myBurger.additionHamburger2();
        System.out.println(myBurger.itemizeHamburgerPrice());

        HealthyBurger myHealthyBurger = new HealthyBurger("god", 10);
        System.out.println(myHealthyBurger.getPrice());
        System.out.println(myHealthyBurger.itemizeHamburgerPrice());
        myHealthyBurger.addHealthyAddition1();
        myHealthyBurger.addHealthyAddition2();
        System.out.println(myHealthyBurger.itemizeHamburgerPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getPrice());
        System.out.println(deluxeBurger.itemizeHamburgerPrice());
    }
}
