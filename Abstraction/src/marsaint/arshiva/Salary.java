package marsaint.arshiva;

public class Salary extends Employee {

    private double salary;
    private double bonus;

    public Salary(String name, String address, int number, double salary, double bonus) {
        super(name, address, number);
        setSalary(salary);
        setBonus(bonus);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("salary cannot be 0 or negative");
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double computePay() {
        System.out.println("compute pay for salary: " + super.getName());
        return this.salary + this.bonus;
    }
}
