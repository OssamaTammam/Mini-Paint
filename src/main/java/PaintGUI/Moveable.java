/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PaintGUI;

import java.awt.Point;

/**
 *
 * @author alfa
 */
public interface Moveable {
    
    public void setDraggingPoint (Point point);
    
    public Point getDraggingPoint();
    
    public boolean contains(Point point);
    
    public void moveTo(Point point);
    

}
