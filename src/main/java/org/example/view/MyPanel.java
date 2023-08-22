package org.example.view;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Panel greenPanel = new Panel();
    Panel greenPanel2 = new Panel();
    Panel whitePanel = new Panel();

    public void greenPanel() {
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 0, 250, 250);
    }

    public void whitePanel() {
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(250, 0, 250, 250);
    }

    public void greenPanel2() {
        greenPanel2.setBackground(Color.GREEN);
        greenPanel2.setBounds(0, 250, 250, 250);
    }
}
