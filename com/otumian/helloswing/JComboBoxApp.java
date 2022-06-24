package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxApp {

    public JComboBoxApp() {
        BaseUI baseUI = new BaseUI("JComboBox App");

        JComboBox<String> comboBox = new JComboBox<>(new String[]{
                "Programming 1", "Programming 2",
                "Software Engineer", "Artificial Intelligence",
                "Operating Systems", "Networking",
                "Logic", "Maths"
        });

        comboBox.setBounds(10, 10, 300, 40);

        JLabel label = new JLabel("");
        label.setBounds(10, 50, 300, 40);

        /*comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // label.setText("You selected " + comboBox.getSelectedItem().toString());
                label.setText("You selected " + comboBox.getItemAt(comboBox.getSelectedIndex()));
            }
        });*/

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                label.setText("You selected " + itemEvent.getItem());
            }
        });

        baseUI.add(new Component[]{comboBox, label});

        baseUI.App();
    }

    public static void main(String[] args) {
        new JComboBoxApp();
    }
}
