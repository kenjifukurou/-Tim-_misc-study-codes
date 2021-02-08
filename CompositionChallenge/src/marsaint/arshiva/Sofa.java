package marsaint.arshiva;

public class Sofa {

    private String model;
    private String manufacturer;
    private Size size;

    public Sofa(String model, String manufacturer, Size size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Size getSize() {
        return size;
    }
}
