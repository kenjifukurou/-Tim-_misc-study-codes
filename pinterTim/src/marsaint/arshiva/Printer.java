package marsaint.arshiva;

public class Printer {

    private int toner;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(int toner, boolean isDuplex) {
        if (toner >= 0 && toner <=100) {
            this.toner = toner;
        }
        this.isDuplex = isDuplex;
        this.pagePrinted = 0;
    }

    public void addToner(int amount) {
        if (this.toner == 100) {
            System.out.println("toner is full, refill cancelled");
            return;
        }
        if (amount > 0 && amount <= 100) {
            if ((this.toner + amount) > 100) {
                this.toner = 100;
                System.out.println("toner is full, " + "toner level: " + this.toner);
            } else {
                this.toner += amount;
                System.out.println("toner level: " + this.toner);
            }
        } else {
            System.out.println("invalid number");
        }
    }

    public void printPage(int page, boolean doubleSide) {
        if (!doubleSide) {
            System.out.println("process printing single page");
            this.pagePrinted = page;
        } else {
            System.out.println("process printing double page");
            int doubleSidedPage = (page / 2) + (page % 2);
            this.pagePrinted = doubleSidedPage;
        }
        System.out.println("page printed: " + this.pagePrinted);
    }



    public int getToner() {
        return toner;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
