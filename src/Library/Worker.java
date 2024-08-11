package Library;

public class Worker implements Reader {

    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeBook(Administrator administrator, String bookName) {
        administrator.giveBook(this, bookName);
    }
}
