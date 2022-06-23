package com.otumian.helloswing;

import javax.swing.JFrame;
import java.awt.*;

public class BaseUI extends JFrame {
    public BaseUI() {}

    public BaseUI(String title) {
        super.setTitle(title);
    }

    public void add(Component[] componentList) {
        for(Component component: componentList) {
            getContentPane().add(component);
        }
    }

    public void App() {
        // frame.setLocation(500, 350); // TODO: add for single screen
        setLocation(1700, 350); // TODO: remove before for single screen
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
}
