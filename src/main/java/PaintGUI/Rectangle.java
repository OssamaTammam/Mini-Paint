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
public class Rectangle extends AbstractShape {

    private int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics canvas) {

        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, width, height);
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x, getPosition().y, width, height);
    }

    @Override
    public boolean contains(Point point) {
        int limitX = getPosition().x + width;
        int limitY = getPosition().y + height;
        if (point.x >= getPosition().x && point.x <= limitX && point.y >= getPosition().y && point.y <= limitY) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void moveTo(Point point) {
        this.setPosition(point);
    }

}
