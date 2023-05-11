package entity;

import java.util.ArrayList;

public class TaskCatalog {

    private ArrayList<Task> taskList;
    private int size;

    public TaskCatalog() {
        this.taskList = new ArrayList<>();
        this.size = 0;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task newTask) {
        taskList.add(newTask);
        size++;
    }

    public void removeTask(Task task) {
        taskList.remove(task);
        size--;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        return taskList.toString();
    }
}
