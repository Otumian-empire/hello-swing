package com.otumian.helloswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonApp {
    static int counter = 0;

    public static void main(String[] args) {
        // create the root window
        JFrame frame = new JFrame("JButtons");

        // Change the text on this label when the button is clicked
        JLabel label = new JLabel("Hello");
        label.setBounds(50, 50, 150, 40);

        // JButton to click and change on the JLabel
        JButton button = new JButton("Click");
        // button.setSize(100, 100);
        button.setBounds(50, 100, 150, 40);

        // add an event to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter++;
                label.setText("Counter: " + counter);
            }
        });

        // add the label and button to the frame window
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);

        // frame.setLocation(500, 350); // TODO: add for single screen
        frame.setLocation(1700, 350); // TODO: remove before for single screen
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
