import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Goal> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String pesel, int hired) {
        super(firstName, lastName, address, email, pesel, hired);

    }

    public void addGoals(Goal goal) {
        goals.add(goal);
        System.out.println(goals);
        salary += goal.bonus;
    }
}