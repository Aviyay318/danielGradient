package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;

    public Panel(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;

        this.setBounds(x,y,width,height);
        this.setBackground(Color.BLUE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                generateRandomColors();
                repaint();
            }
        });
    }


    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
       Graphics2D g2d = (Graphics2D) graphics;
       GradientPaint gradientPaint= new GradientPaint(x,y,getBackground(),width,height,generateRandomColors());
       g2d.setPaint(gradientPaint);
       g2d.fillRect(x,y,width,height);
    }
    private Color generateRandomColors(){
        int red= (int) (Math.random()*256);
        int green= (int) (Math.random()*256);
        int blue= (int) (Math.random()*256);
        return new Color(red,green,blue);
    }
    private void generateColors(){
        Color color1=generateRandomColors();
        Color color2= generateRandomColors();
        setBackground(color1);
        setForeground(color2);
    }

}
