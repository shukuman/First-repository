package Person;

public class Person3Test {
    public static void main(String[] args) {
        Person3 p = new Person3("Jack", -20, 101); //p.name = ""; //Ошибка, поле "name" в классе "Person3" приватный
        System.out.println("Изначальное имя: " + p.getName());
        System.out.println("Старый возраст: " + p.getAge());
        System.out.println("Старый вес: " + p.getWeight());

        p.setName("Joker"); //присвоили новое имя
        System.out.println("Новое имя: " + p.getName());
        p.setName("Ivan"); //выдаст ошибку, так как сделали условие на имя "Иван"

        p.setAge(24); //присвоили новый возраст
        System.out.println("Новый возраст: " + p.getAge());
        p.setAge(-10); //выдаст ошибку, так как возраст не может быть меньше 0

        p.setWeight(100); //присвоили новый вес
        System.out.println("Новый вес: " + p.getWeight());
        p.setWeight(113); //если вес больше 100, то опасно для здоровья
    }
}
