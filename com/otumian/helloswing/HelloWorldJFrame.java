package com.otumian.helloswing;

import javax.swing.*;

public class HelloWorldJFrame extends JFrame {

    public HelloWorldJFrame() {
        System.out.println("HelloWorldJFrame using the constructor");
        final int side = 400;

        setTitle("Hello Swing - Class");
        setSize(side, side);

        JLabel label = new JLabel("Welcome to the GUI world of Java :)!");
        getContentPane().add(label);

        setVisible(true);
    }

    public HelloWorldJFrame(String title) {
        System.out.println("HelloWorldJFrame using an overloaded constructor by passing title");
        final int side = 400;

        setTitle(title);
        setSize(side, side);

        JLabel label = new JLabel("Welcome to the GUI world of Java :)!");
        getContentPane().add(label);

        setVisible(true);
    }

    public HelloWorldJFrame(String title, int size) {
        System.out.println("HelloWorldJFrame using an overloaded constructor by passing title and size");

        setTitle(title);
        setSize(size, size);
    }

    public static void main(String[] args) {
        // Create an object to initialize the app
        // new HelloWorldJFrame();

        // Create an object to initialize the app and pass the title
        // new HelloWorldJFrame("HelloWorldJFrame using the constructor");

        // create an object and call the start method
        HelloWorldJFrame helloWorldJFrame = new HelloWorldJFrame("HelloWorldJFrame using the constructor", 450);
        helloWorldJFrame.start();
    }

    public void start() {
        System.out.println("HelloWorldJFrame");

        JLabel label = new JLabel("Welcome to the GUI world of Java :)!");
        getContentPane().add(label);

        setVisible(true);
    }


}
