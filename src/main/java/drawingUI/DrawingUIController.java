package drawingUI;

import javax.swing.*;
import java.awt.*;

import shapes.Drawing;
import shapes.ShapeDB;


public class DrawingUIController {
    public static JPanel controlsPanel;
    public static JPanel mainPanel;

    // Constructor
    public DrawingUIController() {
        controlsPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setLayout(new GridLayout(3, 1));

        Drawing drawingObj = new Drawing();
        mainPanel.add(drawingObj);

    }

    public JPanel getMainPanel(){
        return mainPanel;
    }

}

