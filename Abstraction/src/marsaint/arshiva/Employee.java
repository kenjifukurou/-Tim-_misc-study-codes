package marsaint.arshiva;

abstract class Employee {

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("compute pay: ");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }
}
