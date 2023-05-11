package entity;

public class Task {

    private String name;
    private String description;
    private boolean[] todoDays;
    private boolean isDone;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.todoDays = new boolean[]{false,false,false,false,false,false};
        this.isDone = false;
    }

    public Task() {
        this.name = "EMPTY NAME";
        this.description = "EMPTY DESCRIPTION";
        this.todoDays = new boolean[]{false,false,false,false,false,false};
        this.isDone = false;
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

    public boolean[] getReminderDays() {
        return todoDays;
    }

    public void setReminderDays(boolean[] reminderDays) {
        this.todoDays = reminderDays;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String toString() {
        return String.format("Task Name: %s\nDescription: %s\n", name, description);
    }
}
