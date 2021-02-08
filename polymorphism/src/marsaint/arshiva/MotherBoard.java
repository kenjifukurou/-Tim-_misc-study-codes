package marsaint.arshiva;

public class MotherBoard {

    private String model;
    private String manufacturer;
    private int ramSlot;
    private int graphicsSlot;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlot, int graphicsSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.graphicsSlot = graphicsSlot;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println(programName + "has loaded");
    }



    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getGraphicsSlot() {
        return graphicsSlot;
    }

    public String getBios() {
        return bios;
    }
}
