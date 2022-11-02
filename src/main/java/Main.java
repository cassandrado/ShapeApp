import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import drawingUI.DrawingUIController;

public class Main {
    static GraphicsConfiguration gc;    // Class field containing config info

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);    // Create a new JFrame
        DrawingUIController d = new DrawingUIController();
        frame.setSize(500, 600);
        //frame.getContentPane().add(new ButtonPanel("butt1"));
        frame.setVisible(true);

        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {    // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
            });
        frame.add(d.getMainPanel());
        }

}







