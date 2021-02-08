package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        showDayOfTheWeek(-4);
    }

    public static void showDayOfTheWeek(int day) {
        //enter number, show what day is that day
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter number between 1 ~ 7");
                break;
        }
    }
}
