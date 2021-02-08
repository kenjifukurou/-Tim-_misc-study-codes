package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer("DS5070", "Canon", 0, 50, 50, 30, 20, true);

        System.out.println(myPrinter.getBlackToner());
        myPrinter.printPage();
        myPrinter.printPage();
        myPrinter.printPage();

        myPrinter.fillToner();
        System.out.println(myPrinter.getBlackToner());
        myPrinter.printPage();
        myPrinter.printPage();
        myPrinter.printPage();

        myPrinter.printDoubleSidedPage();
        System.out.println(myPrinter.getBlackToner());
    }
}
