package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("construct click listener");
            }

            @Override
            public void onClick(String title) {

                System.out.println("implement onClickListener");
                System.out.println(title + " was clicked");

            }
        }

        Button btn = new Button("Start");
        btn.clickButton();

        btn.setOnClickListener(new ClickListener());
        btn.clickButton();
    }
}
