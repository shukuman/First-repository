package Library;

public class Student implements Reader {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Administrator administrator, String bookName) {
        administrator.giveBook(this, bookName);
    }

    @Override
    public String getName() {
        return name;
    }
}
