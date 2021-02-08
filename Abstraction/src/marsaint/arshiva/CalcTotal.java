package marsaint.arshiva;

public class CalcTotal extends CalcSalary {

    private double bonus;

    public CalcTotal(double dailySalary, int day, double bonus) {
        super(dailySalary, day);
        this.bonus = bonus;
    }

    @Override
    public double calcTotalSalary() {
        return calcBasicSalary() + this.bonus;
    }
}
