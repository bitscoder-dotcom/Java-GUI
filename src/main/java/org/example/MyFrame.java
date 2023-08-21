package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("bitsCoder first JFrame");
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);

        ImageIcon appLogo = new ImageIcon("src/main/resources/bc.png");
        this.setIconImage(appLogo.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
