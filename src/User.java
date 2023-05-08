import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private UserAccount userAccount;
    private HabitCatalog habitCatalog;


    public User(String firstName, String lastName, UserAccount userAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAccount = userAccount;
        this.habitCatalog = new HabitCatalog();
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

}
