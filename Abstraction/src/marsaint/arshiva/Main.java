package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Calc guy = new CalcTotal(325, 30, 1000);
        double guySalary = guy.calcTotalSalary();
        System.out.println(guySalary);

    }
}
