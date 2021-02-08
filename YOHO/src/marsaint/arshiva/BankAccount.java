package marsaint.arshiva;

public class BankAccount {
    private int accNumber;
    private int balance;
    private String name;
    private String email;
    private int phone;

    //constructor
    public BankAccount() {
        this(9999, 123, "Mars", "mar@gmail.com", 654987);
        System.out.println("constructor without parameter");
    }

    //constructor with parameter
    public BankAccount(int accNumber, int balance, String name, String email, int phone) {
//        this.accNumber = accNumber;
//        this.balance = balance;
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
        setAccountNumber(accNumber);
        setBalance(balance);
        setName(name);
        setEmail(email);
        setPhone(phone);
        System.out.println("constructor with parameters created");
    }

    public BankAccount(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    //set-get account number
    public void setAccountNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public int getAccountNumber() {
        return this.accNumber;
    }

    //set-get balance
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    //set-get name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    //set-get email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    //set-get phone
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return this.phone;
    }

    //deposit fund
    public void depositFund(int fund) {
        this.balance += fund;
        System.out.println("balance = " + this.balance);
    }

    //withdraw fund
    public void withdrawFund(int fund) {
        if (balance > fund) {
            this.balance -= fund;
            System.out.println("balance = " + this.balance);
        } else {
            System.out.println("insufficient fund");
        }
    }
}
