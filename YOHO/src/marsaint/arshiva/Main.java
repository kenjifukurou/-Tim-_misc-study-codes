package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        VIPCustomer vipcustomer = new VIPCustomer();

        System.out.println(vipcustomer.getName());
        System.out.println(vipcustomer.getCreditLimit());
        System.out.println(vipcustomer.getEmailAddress());

        VIPCustomer vipCustomerX = new VIPCustomer("Arshiva", "arshiva@gmail.com");
        System.out.println(vipCustomerX.getName());
        System.out.println(vipCustomerX.getCreditLimit());
        System.out.println(vipCustomerX.getEmailAddress());
    }
}
