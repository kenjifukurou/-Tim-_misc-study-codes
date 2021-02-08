package marsaint.arshiva;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>(); // instantiate branch slots
    }

    public boolean addBranch(String name) {
        if (findBranchByName(name) == null) {
            Branch newBranch = new Branch(name);
            branches.add(newBranch);
            System.out.println("branch " + name + " has added");
            return true;
        } else {
            System.out.println("branch already exist");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        // add customer to existing branch, check if branch exist
        Branch existingBranch = findBranchByName(branchName);
        if (existingBranch != null) {
            if (existingBranch.newCustomer(customerName, initialAmount)) {
                System.out.println(branchName + " added new customer named: " + customerName + " , amount: " + initialAmount);
                return true;
            } else {
                System.out.println("error adding new customer");
                return false;
            }
        } else {
            System.out.println(branchName + " not found");
            return false;
        }
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranchByName(branchName);
        if (existingBranch != null) { //found branch, process to add
            if (existingBranch.addTransaction(customerName, amount)) { //if can add
                System.out.println(branchName + ", account: " + customerName + " ---> " + amount);
                return true;
            } else {
                System.out.println("error adding transaction");
                return false;
            }
        } else {
            System.out.println(branchName + " not found");
            return false;
        }
    }

    public Branch findBranchByName(String name) {
        for (int i=0; i<branches.size(); i++) {
            Branch existingBranch = branches.get(i);
            if (existingBranch.getBranchName().equals(name)) {
                System.out.println(name + " branch exist");
                return existingBranch;
            }
        }
        System.out.println("branch not found");
        return null;
    }

    public boolean showBranchCustomers(String branchName, boolean transactionRecords) {
        Branch existingBranch = findBranchByName(branchName);
        if (existingBranch != null) {
            System.out.println(branchName + " customer list:");
            existingBranch.showListOfCustomers(transactionRecords);
            return true;
        } else {
            System.out.println(branchName + " branch not found");
            return false;
        }
    }
}
