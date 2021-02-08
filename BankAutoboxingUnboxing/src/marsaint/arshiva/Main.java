package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Branch newBranch = new Branch("kajang");

        System.out.println(newBranch.getCustomer());

        Branch kajangBranch = new Branch("Kajang");

        kajangBranch.addCustomer("kenji", 999.50);
        kajangBranch.addCustomer("arshiva", 150.90);

        System.out.println("total customer in kajang: " + kajangBranch.queryCustomerArrayList());
    }
}
