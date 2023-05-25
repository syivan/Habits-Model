package gui;

import javax.swing.*;
import java.awt.*;

public class HabitPanel extends JPanel {

    public HabitPanel() {

        this.setBorder(BorderFactory.createTitledBorder("Habits"));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
    }
}
