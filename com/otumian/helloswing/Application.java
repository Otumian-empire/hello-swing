package com.otumian.helloswing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        /*Runnable runner = new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Button Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton button = new JButton("Select Me");
// Define ActionListener
                ActionListener actionListener = new ActionListener() {
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println("I was selected.");
                    }
                };
// Attach listeners
                button.addActionListener(actionListener);
                frame.add(button, BorderLayout.SOUTH);
                frame.setSize(300, 100);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);*/
        /*JFrame window = new JFrame("Hello swing");
        window.setSize(400, 400);

        final JButton btn1 = new JButton("First button");
        final JButton btn2 = new JButton("Second button");
        final JButton btn3 = new JButton("Third button");
        final JButton btn4 = new JButton("Fourth button");
        final JButton btn5 = new JButton("Fifth button");*/

        /*GridLayout gridLayout = new GridLayout(2, 4, 10, 20);

        JPanel jPanel = new JPanel(gridLayout);

        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn5);

        window.add(BorderLayout.CENTER, jPanel);*/

        /*window.add(BorderLayout.PAGE_START, btn1);
        window.add(BorderLayout.LINE_START, btn2);
        window.add(BorderLayout.CENTER, btn3);
        window.add(BorderLayout.LINE_END, btn4);
        window.add(BorderLayout.PAGE_END, btn5);*/

        /*window.add(btn1, FlowLayout.LEFT);
        window.add(BorderLayout.LINE_START, btn2);
        window.add(BorderLayout.CENTER, btn3);
        window.add(BorderLayout.LINE_END, btn4);
        window.add(BorderLayout.PAGE_END, btn5);*/

        /*JLabel label = new JLabel("Hello world label");
        window.add(BorderLayout.PAGE_START, label);

        JButton btn = new JButton("Hello world label");
        window.add(BorderLayout.PAGE_END, btn);*/

        // panel
        /*JLabel label = new JLabel("Hello world label");
        JButton btn = new JButton("Hello world label");

        JPanel jPanel = new JPanel();
        jPanel.add(label);
        jPanel.add(btn);

        window.add(jPanel);*/

        /*window.setVisible(true);*/

        //Creating the Frame
        /*JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);*/

        //Creating the MenuBar and adding components
        /*JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);*/

        //Creating the panel at bottom and adding components
        /*JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts up to 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);*/

        // Text Area at the Center
        /*JTextArea ta = new JTextArea();*/

        //Adding Components to the frame.
        /*frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);*/

    }
}

/*
Resource references:
https://www.section.io/engineering-education/introduction-to-java-swing/
*/