import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MiscMenu {

    private JPanel MiscPanel;
    private JFrame myFrame;

    static final int PANEL_WIDTH = 500;
    static final int PANEL_HEIGHT = 500;
    Image bar;
    Timer timer;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    public static void main() {
        JFrame myFrame = new JFrame("Misc");
        myFrame.setContentPane(new MiscMenu().MiscPanel);
        myFrame.pack();
        myFrame.setSize(1200, 600);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);

        myFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.out.println("Misc Menu closed");
            }
        });

//        MiscPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
//        bar = new
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(50));
        g2D.drawLine(0,0,500,500);
        //g2D.drawRect(0, 0, 200, 300);
    } // 27/3/24 drawing stuff not working despite following video exactly
      // thank you for testing my ability to suffer, java swing
}
