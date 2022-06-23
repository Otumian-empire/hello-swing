package com.otumian.helloswing;

import javax.swing.*;

class HelloWorld {

    public static void main(String[] args) {
        final int side = 400;

        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(side, side);

        JLabel label = new JLabel("Welcome to the GUI world of Java :)!");
        frame.getContentPane().add(label);

        frame.setVisible(true);
    }
}