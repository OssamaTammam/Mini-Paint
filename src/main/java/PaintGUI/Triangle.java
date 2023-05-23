package PaintGUI;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author moham
 */
public class Triangle extends AbstractShape {

    private Point p2;
    private Point p3;

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawPolygon(new int[]{this.getPosition().x, p2.x, p3.x}, new int[]{this.getPosition().y, p2.y, p3.y}, 3);
        canvas.setColor(getFillColor());
        canvas.fillPolygon(new int[]{this.getPosition().x, p2.x, p3.x}, new int[]{this.getPosition().y, p2.y, p3.y}, 3);
    }

    float sign(Point p1, Point p2, Point p3) {
        return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);
    }

    @Override
    public boolean contains(Point point) {
        float d1, d2, d3;
        boolean has_neg, has_pos;

        d1 = sign(point, this.getPosition(), p2);
        d2 = sign(point, p2, p3);
        d3 = sign(point, p3, this.getPosition());

        has_neg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        has_pos = (d1 > 0) || (d2 > 0) || (d3 > 0);

        return !(has_neg && has_pos);
    }

    @Override
    public void moveTo(Point point) {
        int oldX = this.getPosition().x;
        int oldY = this.getPosition().y;
        int offsetX = point.x - oldX;
        int offsetY = point.y - oldY;

        this.setPosition(point);
        this.setP2(new Point(p2.x + offsetX, p2.y + offsetY));
        this.setP3(new Point(p3.x + offsetX, p3.y + offsetY));
        
    }

}
