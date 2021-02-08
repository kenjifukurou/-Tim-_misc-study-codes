public class Main {

    public static void main(String[] args) {

        House blueHouse = new House("blue");
        System.out.println(blueHouse.getColor());

        House newHouse = blueHouse;
        System.out.println(newHouse.getColor());

        newHouse.setColor("yellow");
        System.out.println(newHouse.getColor());
        System.out.println(blueHouse.getColor());

    }
}
