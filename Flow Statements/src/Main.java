public class Main {

    public static void main(String[] args) {

        switchChar();
        switchMonth();
    }

    public static void switchMonth() {

        String month = "febRUARY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("一月");
                break;
            case "february":
                System.out.println("二月");
                break;
            case "march":
                System.out.println("三月");
                break;
            case "april":
                System.out.println("四月");
                break;
            default:
                System.out.println("无月");
        }
    }

    public static void switchChar() {

        char characterX = 'C';

        switch (characterX) {
            case 'A':
                System.out.println("char is A");
                break;
            case 'B':
                System.out.println("char is B");
                break;
            case 'C':
                System.out.println("char is C");
                break;
            case 'D':
                System.out.println("char is D");
                break;
            case 'E':
                System.out.println("char is E");
                break;
            default:
                System.out.println("out of list");
                break;
        }
    }


    public static void switchCheckInt() {

        int checkValue = 11;
        String checkString = "abc";

        switch (checkValue) {
            case 1:
                System.out.println("value is 1");
            case 2:
                System.out.println("value is 2");
            case 3:
                System.out.println("value is 3");
            case 4:
                System.out.println("value is 4");
            case 5:
                System.out.println("value is 5");
            case 6:
                System.out.println("value is 6");
                break;
            case 7:
                System.out.println("value is 7");
            case 8:
                System.out.println("value is 8");
            case 9: case 10: case 11: {
                System.out.println("case 9, 10, 11, the value is " + checkValue);
                break;
            }
            default:
                System.out.println("value is 0");
        }
    }
}
