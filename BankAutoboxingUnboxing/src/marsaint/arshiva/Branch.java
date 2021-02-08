package marsaint.arshiva;

import java.util.ArrayList;

public class Branch {

    private String name;
    ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customerList;
    }

    public Boolean addCustomer(String name, double transactionAmount) {
        Customer newCustomer = new Customer(name, transactionAmount);
        customerList.add(newCustomer);
        return true;
    }

    public int queryCustomerArrayList() {
        int totalCustomer = 1;
        for (int i=0; i<customerList.size(); i++) {
            System.out.println(i);
            totalCustomer = (i += i);
        }
        return totalCustomer;
    }
}
