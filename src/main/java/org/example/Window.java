package org.example;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        this.setSize(256,256);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Panel(0,0,256,256));
        this.setVisible(true);
    }
}
