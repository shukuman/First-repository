package Interface.Students;

public class StudentImpl implements Student {
    private String name;
    public StudentImpl(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void getMath() {
    }
}
