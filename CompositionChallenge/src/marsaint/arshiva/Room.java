package marsaint.arshiva;

public class Room {

    private Light light;
    private Bed bed;
    private Sofa sofa;
    private Desk desk;

    public Room(Light light, Bed bed, Sofa sofa, Desk desk) {
        this.light = light;
        this.bed = bed;
        this.sofa = sofa;
        this.desk = desk;
    }

    public void sleep() {
        bed.AICleanBed();
        light.lightOff();
    }

    public Light getLight() {
        return light;
    }

    public Bed getBed() {
        return bed;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Desk getDesk() {
        return desk;
    }
}
