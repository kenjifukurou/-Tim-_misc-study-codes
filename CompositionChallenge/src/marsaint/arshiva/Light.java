package marsaint.arshiva;

public class Light {

    private String type;
    private int brightness;

    public Light(String type, int brightness) {
        this.type = type;
        this.brightness = brightness;
    }

    public void lightOn() {
        System.out.println("light is on");
        adjustBrightness(6000);
    }

    public void lightOff() {
        System.out.println("light is off");
        adjustBrightness(0);
    }

    private void adjustBrightness(int setBrightness) {
        this.brightness = setBrightness;
        System.out.println("light brightness is: " + brightness);
    }


//    public String getType() {
//        return type;
//    }
//
//    public int getBrightness() {
//        return brightness;
//    }
}
