package marsaint.arshiva;

import java.util.ArrayList;

public class Customer {

    private String name;
    ArrayList<Double> transactionList;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactionList = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double transactionAmount) {
        transactionList.add(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }
}
