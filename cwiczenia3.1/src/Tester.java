import java.util.ArrayList;

public class Tester extends Employee {
    ArrayList<String> testTypes = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, String pesel, int hired) {
        super(firstName, lastName, address, email, pesel, hired);
    }

    public void addTestType(String type) {
        testTypes.add(type);
        salary += 300;
    }
}