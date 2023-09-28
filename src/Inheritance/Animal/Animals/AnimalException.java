package Inheritance.Animal.Animals;

public class AnimalException {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Animals animal = pet;

        Pet pet2 = (Pet) animal;
        pet2.introduce();
    }
}
