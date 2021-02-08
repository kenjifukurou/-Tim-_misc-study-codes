package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button myButton = new Button("Button Title")

    public static void main(String[] args) {



        //inner local class implements OnClickListener
        class ClickListener implements OnClickListener {

            //constructor
            public ClickListener() {
                System.out.println("click listener constructed");
            }

            @Override
            public void onClick(String title) {
                System.out.println("onClick clicked");
            }
        }

        myButton.setOnClickListener(new ClickListener());


    }
}
