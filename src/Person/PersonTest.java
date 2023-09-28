package Person;

import Person.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ivan";
        person1.surname = "Sokolov";
        person1.age = 25;
        person1.salary = 200000;

        person1.salaryUp();
        System.out.println(person1.salary);

        person1.newName();
        System.out.println(person1.name);

        Person person2 = new Person();
        person2.name = "Jhon";
        person2.surname = "Snow";
        person2.age = 25;
        person2.salary = 100000;

        person2.salaryUp();
        System.out.println(person2.salary);

        person2.newName();
        System.out.println(person2.name);

        PersonThis personThis = new PersonThis(32,80, 185);
        System.out.println(personThis.weight);
    }
}
