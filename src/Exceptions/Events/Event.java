package Exceptions.Events;
public abstract class Event {
    private String title;
    private int releaseYear;
    private int age;
    public String toString() {
        return title + releaseYear + age;
    }

    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getAge() {
        return age;
    }
}