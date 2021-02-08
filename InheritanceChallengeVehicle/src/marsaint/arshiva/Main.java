package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        LandCruiser lc = new LandCruiser(100);

        lc.steer(99);
        lc.steer(66);
        lc.accelerate(180);
    }
}
