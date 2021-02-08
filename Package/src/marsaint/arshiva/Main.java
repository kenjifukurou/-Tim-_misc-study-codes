package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        TestWindow testWindow = new TestWindow("This is Window's Head (title)");
        testWindow.setVisible(true);
        testWindow.setTitle("Changed title");
        testWindow.setSize(480, 240);

    }
}
