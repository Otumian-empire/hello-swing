package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldApp {
    public static void main(String[] args) {
        final String windowTitle = "JTextFieldApp";

        BaseUI baseUI = new BaseUI(windowTitle);

        JLabel firstNameLabel = new JLabel("First Name: ");
        JLabel lastNameLabel = new JLabel("Last Name: ");

        JTextField firstNameField = new JTextField("");
        JTextField lastNameField = new JTextField("");

        JButton button = new JButton("Submit");

        final int xCord = 30, yCord = 50, scale = 50, height = 40, width = 200;

        firstNameLabel.setBounds(xCord, yCord, width, height);
        firstNameField.setBounds(xCord, yCord + scale, width, height);

        lastNameLabel.setBounds(xCord, yCord + (scale * 2), width, height);
        lastNameField.setBounds(xCord, yCord + (scale * 3), width, height);

        button.setBounds(xCord, yCord + (scale * 4), width, height);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                if (!firstName.isEmpty() && !lastName.isEmpty()) {
                    baseUI.setTitle(windowTitle + ": " + firstName + " " + lastName);
                } else {
                    baseUI.setTitle(windowTitle);
                }
            }
        });

        baseUI.add(new Component[]{firstNameLabel, firstNameField, lastNameLabel, lastNameField, button});

        baseUI.App();
    }
}
