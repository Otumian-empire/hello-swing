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
                // System.out.println(box.isSelected());
                // if (itemEvent.getStateChange() == 1) {
                if (box.isSelected()) {
                    label.setText(text + " -> checked");
                    /*
                     JOptionPane.showConfirmDialog(box, text + " -> checked");
                     JOptionPane.showConfirmDialog(box, text + " -> checked", "Check Box Response", JOptionPane.OK_OPTION);
                    */
                } else {
                    label.setText(text + " -> unchecked");
                }
            }
        });

        // we could use this but just on this component
        /*box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (box.isSelected()){
                    label.setText(text + " -> selected");
                } else {
                    label.setText(text + " -> unselected");
                }
            }
        });*/


        baseUI.add(new Component[]{label, box});

        baseUI.App();
    }

    public static void main(String[] args) {
        new JCheckBoxApp();
    }
}
