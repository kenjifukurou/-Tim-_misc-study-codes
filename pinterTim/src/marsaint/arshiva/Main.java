package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer(10, false);

        System.out.println(myPrinter.getToner());
        myPrinter.addToner(30);
        myPrinter.addToner(70);
        myPrinter.addToner(10);

        myPrinter.printPage(10, false);
        myPrinter.printPage(10, true);
        myPrinter.printPage(11, true);
    }
}
