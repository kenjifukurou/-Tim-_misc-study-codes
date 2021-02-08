package marsaint.arshiva;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>(); // instantiate Customer array slots
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Boolean newCustomer(String name, double initialTransaction) {
        // if exist: check name:
        if (findCustomerByName(name) == null) {
            Customer newCustomer = new Customer(name, initialTransaction);
            customers.add(newCustomer);
            System.out.println(name + " added, with initial transaction: " + initialTransaction);
            return true;
        } else {
            System.out.println(name + " already exist, cancel add new customer");
            return false;
        }

    }

    public Boolean addTransaction(String name, double transactionAmount) {
        Customer existingCustomer = findCustomerByName(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transactionAmount);
            System.out.println("transaction " + transactionAmount + " added into " + name + " account");
            return true;
        } else {
            System.out.println("error adding transaction");
            return false;
        }
    }

    public Customer findCustomerByName(String name) {
        for (int i=0; i<customers.size(); i++) {
            Customer existingCustomer = customers.get(i);
            if (existingCustomer.getCustomerName().equals(name)) {
                System.out.println(name + " found in record");
                return existingCustomer;
            }
        }
        System.out.println(name + " not in record");
        return null;
    }

    public void showListOfCustomers(boolean showTransactionRecords) {
        if (showTransactionRecords) {
            System.out.println("showing list of customer name and transaction record: ");
            for (int i=0; i<this.customers.size(); i++) {
                Customer existingCustomer = this.customers.get(i);
                ArrayList<Double> existingCustomerTransactionRecords = existingCustomer.getTransactionRecords();
                for (int j=0; j<existingCustomerTransactionRecords.size(); j++) {
                    double transactionRecord = existingCustomerTransactionRecords.get(j);
                    System.out.println(existingCustomer.getCustomerName() + " ---> " + transactionRecord);
                }
            }
        } else {
            System.out.println("showing list of customer (name only):");
            for (int i=0; i<this.customers.size(); i++) {
                Customer existingCustomer = this.customers.get(i);
                System.out.println(existingCustomer.getCustomerName());
            }
        }
    }
}
