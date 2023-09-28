package Inheritance.Animal;

public class CatConstructorTest {
    public static void main(String[] args) {
        CatConstructor cat1 = new CatConstructor("Barsik", 5);
        CatConstructor cat2 = new CatConstructor("Murzik");

        System.out.println(cat1.age);
        System.out.println(cat2.name);
    }
}
