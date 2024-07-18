package Exceptions.Events;
public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Интерстеллар", 2014, 18)
        };
    }
    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 20),
                new Theatre("Мастер и Маргарита", 2020, 18)
        };
    }
    public static void validEvent(Event event) throws RuntimeException {
        if (event.getTitle() == null) {
            System.out.println(event);
            throw new RuntimeException("Найдено значение 'null'");
        } else if (event.getReleaseYear() == 0 || event.getAge() == 0) {
            System.out.println(event);
            throw new RuntimeException("Найдено значение '0'");
        }
    }
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}