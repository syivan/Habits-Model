package entity;

import java.util.ArrayList;

public class HabitCatalog {

    private ArrayList<Habit> habitList;
    private int size;

    public HabitCatalog () {
        this.habitList = new ArrayList<>();
        this.size = 0;
    }
    public ArrayList<Habit> getHabitList() {
        return habitList;
    }

    public void addHabit(Habit newHabit) {
        habitList.add(newHabit);
        size++;
    }

    public void removeHabit(Habit habit) {
        habitList.remove(habit);
        size--;
    }

    public int size() {
        return habitList.size();
    }

    public String toString() {
        return habitList.toString();
    }
}
