package Inheritance.Animal.Cat;

public class CatTest {
    public static void main(String[] args) {
        Cat[] kittens = new Cat[5];

        kittens[0] = new Cat();
        kittens[1] = new Cat();

        kittens[0].name = "Tom";
        kittens[1].name = "Jerry";

        kittens[0].age = 2;
        kittens[1].age = 1;

        System.out.println(kittens.length);

        Cat pushok = new Cat();
        pushok.name = "Пушок";
        System.out.println(pushok.name);
    }
}
