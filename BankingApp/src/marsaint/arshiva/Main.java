package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Bank cimbBank = new Bank("CIMB");
        cimbBank.addBranch("Kajang");
        cimbBank.addBranch("Selangor");
        cimbBank.addBranch("Penang");

        cimbBank.addCustomer("Selangor", "Arshiva", 10000);
        cimbBank.addCustomer("Kajang", "Marsaint", 10000);

        cimbBank.addTransaction("Selangor", "Arshiva", 5000);

        cimbBank.addTransaction("Kajang", "Marsaint", 555);

        cimbBank.showBranchCustomers("Kajang", true);
    }
}
