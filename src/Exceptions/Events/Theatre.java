package Exceptions.Events;

public class Theatre extends Event {
    private String title;
    private int releaseYear;
    private int age;

    public Theatre(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Произведение: " + title
                + "; год выпуска: " + releaseYear
                + "; ограничение по возрасту: " + age;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }
    @Override
    public int getAge() {
        return age;
    }
}