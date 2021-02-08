package marsaint.arshiva;

public class Bed {

    private String model;
    private String manufacturer;
    private Size size;

    public Bed(String model, String manufacturer, Size size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void AICleanBed() {
        System.out.println("bed has clean");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Size getSize() {
        return size;
    }
}
