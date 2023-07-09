package Objects_classes;

public class RecordStudioTest {
    public static void main(String[] args) {
        // Класс объект = новый Класс();
        RecordStudio recordStudio1 = new RecordStudio(); //Объект класса Objects_classes.RecordStudio

        recordStudio1.name = "Runtime";
        recordStudio1.owner = "Jon Snow";
        recordStudio1.foundationYear = 2015;
        recordStudio1.records = 76;
        System.out.println(recordStudio1.owner);
        System.out.println(recordStudio1.records); // => 76

        recordStudio1.makeNewRecord(); // добавили запись => 77
        System.out.println(recordStudio1.records);
    }
}
