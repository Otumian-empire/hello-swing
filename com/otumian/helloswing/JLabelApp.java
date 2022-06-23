package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelApp {
    public static void main(String[] args) {
        BaseUI baseUI = new BaseUI("JLabel App");

        JLabel label = new JLabel("This is a JLabel Component");
        label.setBounds(30, 50, 200, 50);

        JButton button = new JButton("Reduce JLabel");
        button.setBounds(30, 100, 200, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                final int scale = 10;

                int windowWidth = baseUI.getWidth() + scale;
                int windowHeight = baseUI.getHeight() + scale;

                int xCord = label.getBounds().x + scale;
                int yCord = label.getBounds().y + scale;
                int yCordFactor = button.getBounds().y - label.getBounds().y;

                baseUI.setSize(windowWidth, windowHeight);

                label.setBounds(xCord, yCord, label.getWidth(), label.getHeight());
                button.setBounds(xCord, yCord + yCordFactor, button.getWidth(), button.getHeight());
            }
        });

        baseUI.add(new Component[]{label, button});

        baseUI.App();
    }
}
