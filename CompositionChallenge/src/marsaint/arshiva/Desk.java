package marsaint.arshiva;

public class Desk {

    private String model;
    private String manufacturer;
    private Size size;

    public Desk(String model, String manufacturer, Size size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
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
