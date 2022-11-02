package shapes;

import java.awt.*;

public class Rect extends Shape {

    private int h;
    private int w;


    public Rect(Point initPos, Color col, int height, int width){
        super(initPos, col);
        h = height;
        w = width;
    }
    @Override
    public void draw(Graphics g) {	// A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,h, w);
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
}
