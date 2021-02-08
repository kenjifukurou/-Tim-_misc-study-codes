package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 60, 80);
        Case casing = new Case("modelX", "Tesla", dimensions, 2);

        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("modelM", "Tesla", resolution);

        MotherBoard motherBoard = new MotherBoard("modelY", "Tesla", 4, 2, "XYZ");

        PC newPC = new PC(motherBoard, monitor, casing);
        newPC.powerUp();
    }
}
