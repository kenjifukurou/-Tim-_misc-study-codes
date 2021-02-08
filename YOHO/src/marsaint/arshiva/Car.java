package marsaint.arshiva;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("volvo") || validModel.equals("toyota") || validModel.equals("porsche")) {
            this.model = model;
        } else {
            System.out.println("invalid model");
        }
    }

    public String getModel() {
        return this.model;
    }
}
