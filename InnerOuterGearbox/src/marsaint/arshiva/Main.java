package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        Gearbox gearBox = new Gearbox(6);
        Gearbox.Gear gear1 = gearBox.new Gear(1, 12.5);

        System.out.println(gear1.drivingSpeed(180));

    }
}
