package com.otumian.helloswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonApp {
    public JRadioButtonApp() {
        final String windowTitle = "JRadioButton App";
        final int width = 100, height = 40, xCord = 25;

        BaseUI baseUI = new BaseUI(windowTitle);

        JLabel label = new JLabel("What choose your language");
        label.setBounds(xCord, 0, width * 2, height);

        JRadioButton enRadio = new JRadioButton("English", true);
        enRadio.setBounds(xCord, 50, width, height);

        JRadioButton arRadio = new JRadioButton("Arabic");
        arRadio.setBounds(xCord, 100, width, height);

        JRadioButton ruRadio = new JRadioButton("Russia");
        ruRadio.setBounds(xCord, 150, width, height);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(enRadio);
        buttonGroup.add(arRadio);
        buttonGroup.add(ruRadio);

        JButton button = new JButton("Submit");
        button.setBounds(xCord * 5, 205, width, height);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String message = " You chose, " + getSelectRadioText(new JRadioButton[]{enRadio, arRadio, ruRadio});
                JOptionPane.showConfirmDialog(baseUI, message, windowTitle, JOptionPane.DEFAULT_OPTION);

            }
        });

        baseUI.add(new Component[]{label, enRadio, arRadio, ruRadio, button});


        baseUI.App();
    }

    public static void main(String[] args) {
        new JRadioButtonApp();
    }

    public String getSelectRadioText(JRadioButton[] buttons) {

        for (JRadioButton button : buttons) {
            if (button.isSelected()) {
                return button.getText();
            }
        }

        return "";
    }
}
