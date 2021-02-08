package marsaint.arshiva;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow extends Frame {

    public TestWindow(String title) throws HeadlessException {
        super(title);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("closing...");
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("window activated");;
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font fontLarge = new Font("SansSerif", Font.BOLD, 18);
        Font fontSmall = new Font("Arial", 1, 12);
        g.setFont(fontLarge);
        g.drawString("Arshiva Marsaint", 60, 40);
        g.setFont(fontSmall);
        g.drawString("Kenji Fukurou", 150, 150);
    }
}
