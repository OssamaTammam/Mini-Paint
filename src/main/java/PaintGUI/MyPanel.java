/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintGUI;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ossama
 */
public class MyPanel extends JPanel implements DrawingEngine {
    
    private ArrayList<Shape> shapes;
    
    public MyPanel() {
        shapes = new ArrayList<>();
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
        refresh(null);
    }
    
    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
    
    @Override
    public Shape[] getShapes() {
        return shapes.toArray(Shape[]::new);
    }
    
    @Override
    public void refresh(Graphics canvas) {
        repaint();
    }
}
