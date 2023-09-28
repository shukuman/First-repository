package Person;

public class Person {
    String name;
    String surname;
    int age;
    int salary;

    public void salaryUp() {
        salary += 150000;
    }
    public void newName() {
        name = name + " Junior";
    }
}
