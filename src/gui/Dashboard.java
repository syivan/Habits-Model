package gui;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JPanel {

    private HabitsPanel habitsPanel;

    public Dashboard() {
        this.setLayout(new GridLayout(2,2));
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        habitsPanel = new HabitsPanel();
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("3");

        this.add(habitsPanel);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setVisible(true);

    }

    private void intializeComponents() {


    }


}
