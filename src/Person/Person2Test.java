package Person;

import Inheritance.Animal.Animal;

public class Person2Test {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.name = "Damir";
        p1.age = 27;
        p1.document = new Document();
        p1.animal = new Animal();

        p1.document.FIO = "Султанов Ильяс";
        p1.document.IIN = 12352452;
        p1.document.number = 99998;

        p1.animal.name = "crocodile";
        p1.animal.kind = "mammal";
        p1.animal.color = "green";
    }
}
