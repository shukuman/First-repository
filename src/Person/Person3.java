package Person;

public class Person3 {
    private String name;
    private int age;
    private int weight;

    public Person3(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.equals("Alexey") || name.equals("Ivan")) {
            System.out.println("Ошибка");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка");
        }
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight > 100) {
            System.out.println("Опасно для здоровья");
        } else {
            this.weight = weight;
        }
    }
}
