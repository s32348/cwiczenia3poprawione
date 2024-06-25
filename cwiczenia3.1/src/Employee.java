import java.time.Year;

public class Employee {
    String firstName;
    String lastName;
    String address;
    String pesel;
    String email;
    int hired;
    public int salary = 3000;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int hired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pesel = pesel;
        this.email = email;
        this.hired = hired;
    }

    public int calculateSalary() {
        int year = Year.now().getValue();
        int hiredFor = year - hired;
        salary += hiredFor * 1000;

        return salary;
    }
}