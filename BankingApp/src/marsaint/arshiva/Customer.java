package marsaint.arshiva;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactionRecords;

    public Customer(String customerName, double initialTransactionAmount) {
        this.customerName = customerName;
        this.transactionRecords = new ArrayList<Double>();
        addTransaction(initialTransactionAmount);
    }

    public void addTransaction(double amount) {
        transactionRecords.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionRecords() {
        return transactionRecords;
    }

    public double showTransactionRecords() {
        for (int i=0; i<transactionRecords.size(); i++) {
//            System.out.println("record " + i + " : " + transactionRecords.get(i));
            return transactionRecords.get(i);
        }
        return -1;
    }
}
