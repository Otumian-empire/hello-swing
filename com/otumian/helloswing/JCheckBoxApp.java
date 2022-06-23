package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxApp {

    public JCheckBoxApp() {
        BaseUI baseUI = new BaseUI("JCheckBox App");

        final String text = "Check the check-box below";

        JLabel label = new JLabel(text);
        label.setBounds(10, 0, 350, 50);

        JCheckBox box = new JCheckBox("Checked-Box", true);
        box.setBounds(10, 80, 120, 50);

        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() == 1) {
                    label.setText(text + " -> checked");
                } else {
                    label.setText(text + " -> unchecked");
                }
            }
        });

        baseUI.add(new Component[]{label, box});

        baseUI.App();
    }

    public static void main(String[] args) {
        new JCheckBoxApp();
    }
}
