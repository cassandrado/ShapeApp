package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    Point p = new Point(200, 200);
    Point p2 = new Point(100, 100);
    Point p3 = new Point(150, 50);

    Color c = new Color(0x901159);// The RGB number comprises three bytes: red, green and blue
    Color c2 = new Color(0x159011);
    Color c3 = new Color(0x119085);
    public static ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public ShapeDB() {
        for (int i = 0; i < 3; i++) {
            Circle circ = new Circle(p, c, i * 50);
            Rect rect = new Rect(p2, c2, i * 10, (i + 1) * 10);
            Square squ = new Square(p3, c3, i * 10);
            shapeList.add((Shape) circ);
            shapeList.add((Shape) rect);
            shapeList.add((Shape) squ);
        }
    }

    public static void drawShapes(Graphics g) {
        for (Shape shapeObj : shapeList){
            shapeObj.draw(g);
        }
    }


}
