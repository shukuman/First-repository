package Enum;

public class DayOfWeekTest {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        VeryStrictDiet veryStrictDiet = new VeryStrictDiet();
        veryStrictDiet.takeLunch(dayOfWeek);
    }
}
