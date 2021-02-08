package marsaint.arshiva;

public class VIPCustomer {
    // new class for vip customer
    // need their name, credit limit, email address
    // 3 constructor: 1 is empty, empty but with default value
    // 2nd allow user to enter 1 field
    // 3rd have all field
    // read only, no need setter

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("default name", 500000, "default@gmail.com");
        System.out.println("empty constructor");
    }

    public VIPCustomer(String name, String emailAddress) {
        this(name, 500000, emailAddress);
    }

    public VIPCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}
