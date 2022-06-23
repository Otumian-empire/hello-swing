package com.otumian.helloswing;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonWithBaseUi {

    static int counter = 0;

    public static void main(String[] args) {
        BaseUI baseUI = new BaseUI("JButton using BaseUI");

        JLabel label = new JLabel("Counter: " + counter);
        label.setBounds(50, 50, 150, 40);

        JButton button = new JButton("Click");
        button.setBounds(50, 100, 150, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter++;
                label.setText("Counter: " + counter);
            }
        });

        /*baseUI.getContentPane().add(label);
        baseUI.getContentPane().add(button);*/

        baseUI.add(new Component[]{
                label, button
        });

        baseUI.App();
    }
}
