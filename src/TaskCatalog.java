import java.util.ArrayList;

public class TaskCatalog {

    private ArrayList<Task> taskList;
    private int size;

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task newTask) {
        taskList.add(newTask);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public int getSize() {
        return this.size;
    }
}
