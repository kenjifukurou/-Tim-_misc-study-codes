package marsaint.arshiva;

public class Case {

    private String model;
    private String manufacturer;
    private Dimensions dimensions;
    private int powerSupply;

    public Case(String model, String manufacturer, Dimensions dimensions, int powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.powerSupply = powerSupply;
    }

    public void powerButtonPressed() {
        System.out.println("power button pressed");
    }



    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getPowerSupply() {
        return powerSupply;
    }
}
