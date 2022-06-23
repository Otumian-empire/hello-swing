package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JTextAreaApp {
    static ArrayList<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        int xCord = 25, width = 350;
        final String windowTitle = "JTextArea App";

        BaseUI baseUI = new BaseUI(windowTitle);

        JLabel label = new JLabel("Add a note");
        label.setBounds(xCord, 0, width, 50);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(xCord, 50, width, 100);
        textArea.setLineWrap(true);

        JButton button = new JButton("Add");
        button.setBounds(xCord, 200, width, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String note = textArea.getText();

                if (note != null && !note.isEmpty()) {
                    notes.add(note);
                    textArea.setText("");

                    baseUI.setTitle(windowTitle + ": (" + notes.size()+ ")");
                }
            }
        });

        baseUI.add(new Component[]{label, textArea, button});

        baseUI.App();
    }
}
