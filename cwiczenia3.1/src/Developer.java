import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<Technology> knownTechnologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String pesel, int hired) {
        super(firstName, lastName, address, email, pesel, hired);
    }

    public void addTechnology(Technology tech) {
        knownTechnologies.add(tech);
        System.out.println(knownTechnologies);
        salary += tech.bonus;
    }
}