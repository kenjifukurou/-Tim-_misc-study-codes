package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

            Light light = new Light("Incandescent", 6000);
            Size bedSize = new Size(40, 60, 5);
            Bed bed = new Bed("BedX", "Tesla", bedSize);
            Size sofaSize = new Size(100, 30, 20);
            Sofa sofa = new Sofa("SofaY", "Tesla", sofaSize);
            Size deskSize = new Size(30, 40, 40);
            Desk desk = new Desk("DeskZ", "Tesla", deskSize);

            Room myRoom = new Room(light, bed, sofa, desk);
            myRoom.getLight().lightOn();
            myRoom.sleep();

            Toilet toilet = new Toilet("Flushing", "Tesla");

            Bathroom myBathroom = new Bathroom(light, toilet);
            myBathroom.getToilet().flush();
    }
}
