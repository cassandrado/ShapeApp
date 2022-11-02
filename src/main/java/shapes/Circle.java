package shapes;

import java.awt.*;

/**
 *  The shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Circle extends Shape {
    private int rad;	// Fields

    public Circle(Point initPos, Color col, int radius){
        super(initPos, col); // The constructor
        rad=radius;	// Initialize the fields of the object
    }

    @Override
    public void draw(Graphics g) {	// A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }

//    @Override
//    public Rectangle getBounds() {
//        return null;
//    }
//
//    @Override
//    public Rectangle2D getBounds2D() {
//        return null;
//    }
//
//    @Override
//    public boolean contains(double x, double y) {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Point2D p) {
//        return false;
//    }
//
//    @Override
//    public boolean intersects(double x, double y, double w, double h) {
//        return false;
//    }
//
//    @Override
//    public boolean intersects(Rectangle2D r) {
//        return false;
//    }
//
//    @Override
//    public boolean contains(double x, double y, double w, double h) {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Rectangle2D r) {
//        return false;
//    }
//
//    @Override
//    public PathIterator getPathIterator(AffineTransform at) {
//        return null;
//    }
//
//    @Override
//    public PathIterator getPathIterator(AffineTransform at, double flatness) {
//        return null;
//    }
//
}