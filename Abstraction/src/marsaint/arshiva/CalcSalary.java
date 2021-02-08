package marsaint.arshiva;

abstract class CalcSalary implements Calc {

    private double dailySalary;
    private int day;

    public CalcSalary(double dailySalary, int day) {
        this.dailySalary = dailySalary;
        this.day = day;
    }

    @Override
    public double calcBasicSalary() {
        return this.dailySalary * this.day;
    }
}
