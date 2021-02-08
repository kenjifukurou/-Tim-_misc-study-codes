package marsaint.arshiva;

public class Monitor {

    private String model;
    private String manufacturer;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.println("drawing pixel: " + x + ", " + y + ", Color: " + color);
    }



    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
