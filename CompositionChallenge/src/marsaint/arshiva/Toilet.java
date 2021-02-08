package marsaint.arshiva;

public class Toilet {

    private String type;
    private String manufacturer;

    public Toilet(String type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void flush() {
        System.out.println("flush water");
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
