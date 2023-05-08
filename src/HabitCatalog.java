import java.util.ArrayList;

public class HabitCatalog {

    private ArrayList<Habit> habitList;

    public ArrayList<Habit> getHabitList() {
        return habitList;
    }

    public void addHabit(Habit newHabit) {
        habitList.add(newHabit);
    }

    public void removeHabit(Habit habit) {
        habitList.remove(habit);
    }

}
