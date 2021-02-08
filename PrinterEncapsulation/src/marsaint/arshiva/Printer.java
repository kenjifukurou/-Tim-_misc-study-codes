package marsaint.arshiva;

public class Printer {

    private String name;
    private String manufacturer;
    private int pagePrinted;
    private int redToner;
    private int greenToner;
    private int blueToner;
    private int blackToner;
    private Boolean isDuplex;

    public Printer(String name, String manufacturer, int pagePrinted, int redToner, int greenToner, int blueToner, int blackToner, Boolean isDuplex) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.pagePrinted = pagePrinted;
        this.redToner = redToner;
        this.greenToner = greenToner;
        this.blueToner = blueToner;
        this.blackToner = blackToner;
        this.isDuplex = isDuplex;
    }

    public void fillToner() {
        if (redToner == 100 || greenToner == 100 || blueToner == 100 || blackToner == 100) {
            System.out.println("toner is full");
            return;
        }
        redToner = 100;
        greenToner = 100;
        blueToner = 100;
        blackToner = 100;
        System.out.println("toner has filled");
    }

    public void printPage() {
        if (redToner <= 0 || greenToner <= 0 || blueToner <= 0 || blackToner <= 0) {
            System.out.println("out of ink, printing cancelled");
            return;
        }
        if (redToner < 20 || greenToner < 20 || blueToner < 20 || blackToner < 20) {
            lowTonerWarning();
        }
        System.out.println("process printing");
        reduceToner();
        pagePrinted ++;
        System.out.println("page printed: " + pagePrinted);
    }

    public void printDoubleSidedPage() {
        if (isDuplex) {
            if (redToner > 0 || greenToner > 0 || blueToner > 0 || blackToner > 0) {
                System.out.println("process printing double sided");
                reduceToner();
                reduceToner();
                pagePrinted ++;
                System.out.println("page printed: " + pagePrinted);
            }
        } else {
            printPage();
        }
    }

    public void reduceToner() {
        redToner -= 10;
        greenToner -= 10;
        blueToner -= 10;
        blackToner -= 10;
    }

    public void lowTonerWarning() {
        System.out.println("low ink warning, please refill");
    }


    public int getRedToner() {
        return redToner;
    }

    public int getGreenToner() {
        return greenToner;
    }

    public int getBlueToner() {
        return blueToner;
    }

    public int getBlackToner() {
        return blackToner;
    }
}
