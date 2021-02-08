package marsaint.arshiva;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> doubleList = new ArrayList<Double>();

        for (double d = 0.0; d < 10.0; d += 0.5) {
            System.out.println("add value to arraylist");
            doubleList.add(Double.valueOf(d));
        }

        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println("print double list: " + doubleList.get(i).doubleValue());
        }

    }
}
