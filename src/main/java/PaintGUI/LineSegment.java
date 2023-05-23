/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintGUI;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Ossama
 */
public class LineSegment extends AbstractShape {

    private Point p2;

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public void draw(Graphics canvas) {

        canvas.setColor(getColor());
        canvas.drawLine(getPosition().x, getPosition().y, p2.x, p2.y);
    }

    @Override
    public boolean contains(Point point) {
        int dxc = (int) point.getX() - (int) getPosition().getX();
        int dyc = (int) point.getY() - (int) getPosition().getY();
        int dxl = (int) p2.getX() - (int) getPosition().getX();
        int dyl = (int) p2.getY() - (int) getPosition().getY();
        int cross = dxc * dyl - dyc * dxl;
        if (cross != 0) {
            return false;
        }
        if (dxl > 0) {
            if ((int) getPosition().getX() <= (int) point.getX() && (int) point.getX() <= (int) p2.getX()) {
                return true;
            }
            // check vertical line
        } else if (dxl == 0) {
            if (dyl > 0) {
                return (int) getPosition().getY() <= (int) point.getY() && (int) point.getY() <= (int) p2.getY();
            } else {
                return (int) getPosition().getY() >= (int) point.getY() && (int) point.getY() >= (int) p2.getY();
            }
        } else if ((int) p2.getX() <= (int) point.getX() && (int) point.getX() <= (int) getPosition().getX()) {
            return true;
        }
        return false;
    }

    @Override
    public void moveTo(Point point) {
        int oldX = this.getPosition().x;
        int oldY = this.getPosition().y;
        int offsetX = point.x - oldX;
        int offsetY = point.y - oldY;
        
        this.setPosition(point);
        this.setP2(new Point(p2.x + offsetX, p2.y + offsetY));
    }
}
