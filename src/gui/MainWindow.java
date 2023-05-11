package gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{

    ActionPane actionPane;
    Dashboard dashboard;

    public MainWindow() {
        initializeFrame();
        actionPane = new ActionPane();
        dashboard = new Dashboard();

        setLayout(new BorderLayout());

        Container c = getContentPane();

        c.add(actionPane, BorderLayout.WEST);
        c.add(dashboard, BorderLayout.CENTER);

        this.setVisible(true);

    }

    private void initializeFrame() {
        this.setTitle("Habitats");
        this.setSize(1200,750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
