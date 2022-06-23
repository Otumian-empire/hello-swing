package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;

public class JPasswordApp {
    public static void main(String[] args) {

        final int xCord = 25, yCord = 50, scale = 50, height = 40, width = 200;

        BaseUI baseUI = new BaseUI("JPassword App");

        JLabel usernameLabel, passwordLabel, resultLabel;
        JTextField usernameField;
        JPasswordField passwordField;
        JButton button;

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(xCord, yCord, 100, 30);

        usernameField = new JTextField();
        usernameField.setBounds(xCord + 100, yCord, 100, 30);


        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(xCord, yCord + 60, 100, 30);

        passwordField = new JPasswordField();
        passwordField.setBounds(xCord + 100, yCord + 60, 100, 30);


        button = new JButton("Login");
        button.setBounds(xCord + 100, yCord + 120, 100, 30);

        resultLabel = new JLabel();
        resultLabel.setBounds(xCord, yCord + 160, 370, 30);

        button.addActionListener(actionEvent -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (!username.isEmpty() && !password.isEmpty()) {
                resultLabel.setText("Username: " + username + ", password: " + password);
            }
        });


        baseUI.add(new Component[]{usernameLabel, usernameField, passwordLabel, passwordField, button, resultLabel});

        baseUI.App();
    }
}
