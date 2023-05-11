package entity;

public class User {

    private String firstName;
    private String lastName;
    private UserAccount userAccount;
    private HabitCatalog habitCatalog;
    private TaskCatalog taskCatalog;


    public User(String firstName, String lastName, UserAccount userAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAccount = userAccount;
        this.habitCatalog = new HabitCatalog();
        this.taskCatalog = new TaskCatalog();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public UserAccount getUserAccount() {
        return this.userAccount;
    }

    public HabitCatalog getHabitCatalog() {
        return this.habitCatalog;
    }

    public TaskCatalog getTaskCatalog() {
        return this.taskCatalog;
    }
}
