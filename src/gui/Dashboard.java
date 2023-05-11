package gui;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JPanel {

    private HabitPanel habitPanel;
    private ProgressPanel progressPanel;
    private TaskPanel taskPanel;
    private RewardPanel rewardPanel;

    public Dashboard() {
        this.setLayout(new GridLayout(2,2));
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        habitPanel = new HabitPanel();
        progressPanel = new ProgressPanel();
        taskPanel = new TaskPanel();
        rewardPanel = new RewardPanel();
        this.add(habitPanel);
        this.add(progressPanel);
        this.add(taskPanel);
        this.add(rewardPanel);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setVisible(true);

    }

    private void intializeComponents() {


    }


}
