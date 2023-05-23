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
public class Circle extends AbstractShape {

    int horizontalRadius, verticalRadius;

    public int getHorizontalRadius() {
        return horizontalRadius;
    }

    public void setHorizontalRadius(int horizontalRadius) {
        this.horizontalRadius = horizontalRadius;
    }

    public int getVerticalRadius() {
        return verticalRadius;
    }

    public void setVerticalRadius(int VerticalRadius) {
        this.verticalRadius = VerticalRadius;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawOval(getPosition().x, getPosition().y, 2 * horizontalRadius, 2 * verticalRadius);
        canvas.setColor(getFillColor());
        canvas.fillOval(getPosition().x, getPosition().y, 2 * horizontalRadius, 2 * verticalRadius);
    }

    @Override
    public boolean contains(Point point) {
        int centerX = getPosition().x + horizontalRadius;
        int centerY = getPosition().y + verticalRadius;

        if ((point.x - centerX) * (point.x - centerX)
                + (point.y - centerY) * (point.y - centerY) <= horizontalRadius * verticalRadius) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void moveTo(Point point) {

        this.setPosition(new Point(point.x - horizontalRadius, point.y - verticalRadius));
    }
}
