package Inheritance.Animal.Animals;

public class Test {
    public static void main(String[] args) {
        Animals animal = new Pet(); //  расширение ссылочного типа Pet и запись его объекта в переменную типа Inheritance.Animal.Animals
        animal.introduce();

        WildAnimal wildAnimal = new Coyote();
        wildAnimal.introduce();

        Coyote coyote = (Coyote) wildAnimal;
        coyote.introduce();
    }
}
