import java.util.ArrayList;

public class Habit {

    public String name;
    public String description;
    public ArrayList<Task> taskList;
    public boolean[] todoDays;
    public int currentStreak;
    public boolean isDone;

    public Habit(String name, String description) {
        this.name = name;
        this.description = description;
        this.taskList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean[] getTodoDays() {
        return todoDays;
    }

    public void setTodoDays(boolean[] todoDays) {
        this.todoDays = todoDays;
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public void setCurrentStreak(int currentStreak) {
        this.currentStreak = currentStreak;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void addTask(Task newTask) {

    }

    public void removeTask(Task newTask) {

    }
}
