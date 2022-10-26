package com.otumian.helloswing;

import javax.swing.*;

public class JTableApp {

    static class Row {
        private final String id;
        private final String name;
        private final String language;


        public Row(String id, String name, String language) {
            this.id = id;
            this.name = name;
            this.language = language;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLanguage() {
            return language;
        }

        public String[] makeRow() {
            return new String[]{getId(), getName(), getLanguage()};
        }
    }

    public JTableApp() {
        BaseUI baseUI = new BaseUI("JTable App");

        final String[] col = {"ID", "Name", "Lang"};
        final String[][] rows = {
                new Row("1", "John", "python").makeRow(),
                new Row("2", "Paul", "java").makeRow(),
                new Row("3", "Danny", "c++").makeRow()
        };

        JTable table = new JTable(rows, col);
        table.setBounds(10, 10, 350, 300);

        baseUI.add(table);

        baseUI.App();
    }

    public static void main(String[] args) {
        new JTableApp();
    }
}
