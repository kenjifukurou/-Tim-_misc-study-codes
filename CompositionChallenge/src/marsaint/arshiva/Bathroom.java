package marsaint.arshiva;

public class Bathroom {

    private Light light;
    private Toilet toilet;

    public Bathroom(Light light, Toilet toilet) {
        this.light = light;
        this.toilet = toilet;
    }

    public Light getLight() {
        return light;
    }

    public Toilet getToilet() {
        return toilet;
    }
}
