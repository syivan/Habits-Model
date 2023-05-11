package gui;

import javax.swing.*;
import java.awt.*;

public class ActionPane extends JPanel {


    private JButton dashboardButton, accountButton;

    public ActionPane() {
        dashboardButton = new JButton("Dashboard");
        accountButton = new JButton("Account");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(dashboardButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(accountButton, gbc);

        gbc.weighty = 12;
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel blank = new JLabel("");
        add(blank, gbc);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
