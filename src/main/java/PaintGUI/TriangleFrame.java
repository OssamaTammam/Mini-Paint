/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaintGUI;

import java.awt.Point;
import javax.swing.JColorChooser;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author alfa
 */
public class TriangleFrame extends JFrame implements Node {

    /**
     * Creates new form circleFrame
     */
    private Triangle triangle;
    Node parent;

    public TriangleFrame(Triangle triangle) {
        initComponents();
        this.setTitle("Triangle");
        this.triangle = triangle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circleXCor = new javax.swing.JLabel();
        circleYCor = new javax.swing.JLabel();
        circleRadius = new javax.swing.JLabel();
        triX1TextField = new javax.swing.JTextField();
        triY1TextField = new javax.swing.JTextField();
        triX2TextField = new javax.swing.JTextField();
        createTriBtn = new javax.swing.JButton();
        fillColorBtn = new javax.swing.JButton();
        borderColorBtn = new javax.swing.JButton();
        triY2TextField = new javax.swing.JTextField();
        circleRadius1 = new javax.swing.JLabel();
        triX3TextField = new javax.swing.JTextField();
        circleRadius2 = new javax.swing.JLabel();
        triY3TextField = new javax.swing.JTextField();
        circleRadius3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        circleXCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        circleXCor.setText("X1");

        circleYCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        circleYCor.setText("Y1");

        circleRadius.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        circleRadius.setText("X2");

        triX2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triX2TextFieldActionPerformed(evt);
            }
        });

        createTriBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createTriBtn.setText("Create triangle");
        createTriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTriBtnActionPerformed(evt);
            }
        });

        fillColorBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fillColorBtn.setText("Select fill color");
        fillColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillColorBtnActionPerformed(evt);
            }
        });

        borderColorBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borderColorBtn.setText("Select border color");
        borderColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderColorBtnActionPerformed(evt);
            }
        });

        triY2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triY2TextFieldActionPerformed(evt);
            }
        });

        circleRadius1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        circleRadius1.setText("Y2");

        triX3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triX3TextFieldActionPerformed(evt);
            }
        });

        circleRadius2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        circleRadius2.setText("X3");

        triY3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triY3TextFieldActionPerformed(evt);
            }
        });

        circleRadius3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        circleRadius3.setText("Y3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(createTriBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fillColorBtn))
                        .addGap(37, 37, 37)
                        .addComponent(borderColorBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(circleRadius2)
                                    .addComponent(circleRadius3)
                                    .addComponent(circleRadius1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(triX3TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(triY3TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(triY2TextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(circleYCor)
                                        .addComponent(circleRadius))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(circleXCor)
                                        .addGap(1, 1, 1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(triX1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(triY1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(triX2TextField, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(triX1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(circleXCor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(triY1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circleYCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(triX2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circleRadius))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circleRadius1)
                    .addComponent(triY2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(triX3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circleRadius2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(circleRadius3)
                    .addComponent(triY3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fillColorBtn)
                    .addComponent(borderColorBtn))
                .addGap(18, 18, 18)
                .addComponent(createTriBtn)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTriBtnActionPerformed
        // TODO add your handling code here:
        int x1 = Integer.parseInt(triX1TextField.getText());
        int y1 = Integer.parseInt(triY1TextField.getText());
        int x2 = Integer.parseInt(triX2TextField.getText());
        int y2 = Integer.parseInt(triY2TextField.getText());
        int x3 = Integer.parseInt(triX3TextField.getText());
        int y3 = Integer.parseInt(triY3TextField.getText());

        triangle.setPosition(new Point(x1, y1));
        triangle.setP2(new Point(x2, y2));
        triangle.setP3(new Point(x3, y3));
        
        this.setVisible(false);
        ((JFrame) getParentNode()).setVisible(true);


    }//GEN-LAST:event_createTriBtnActionPerformed

    private void borderColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderColorBtnActionPerformed
        // TODO add your handling code here:
        Color borderColor = JColorChooser.showDialog(null, "Choose Border Color", Color.black);
        triangle.setColor(borderColor);

    }//GEN-LAST:event_borderColorBtnActionPerformed

    private void fillColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillColorBtnActionPerformed
        // TODO add your handling code here:
        Color fillColor = JColorChooser.showDialog(null, "Choose Fill Color", Color.black);
        triangle.setFillColor(fillColor);
    }//GEN-LAST:event_fillColorBtnActionPerformed

    private void triX2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triX2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triX2TextFieldActionPerformed

    private void triY2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triY2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triY2TextFieldActionPerformed

    private void triX3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triX3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triX3TextFieldActionPerformed

    private void triY3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triY3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triY3TextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    /* public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CircleFrame(null).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borderColorBtn;
    private javax.swing.JLabel circleRadius;
    private javax.swing.JLabel circleRadius1;
    private javax.swing.JLabel circleRadius2;
    private javax.swing.JLabel circleRadius3;
    private javax.swing.JLabel circleXCor;
    private javax.swing.JLabel circleYCor;
    private javax.swing.JButton createTriBtn;
    private javax.swing.JButton fillColorBtn;
    private javax.swing.JTextField triX1TextField;
    private javax.swing.JTextField triX2TextField;
    private javax.swing.JTextField triX3TextField;
    private javax.swing.JTextField triY1TextField;
    private javax.swing.JTextField triY2TextField;
    private javax.swing.JTextField triY3TextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public Node getParentNode() {
        return parent;
    }
}
