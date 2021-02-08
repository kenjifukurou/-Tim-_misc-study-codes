package marsaint.arshiva;

public class PC {

    private MotherBoard motherBoard;
    private Monitor monitor;
    private Case casing;

    public PC(MotherBoard motherBoard, Monitor monitor, Case casing) {
        this.motherBoard = motherBoard;
        this.monitor = monitor;
        this.casing = casing;
    }

    public void powerUp() {
        casing.powerButtonPressed();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixel(200, 200, "red");
    }


//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Case getCasing() {
//        return casing;
//    }
}
