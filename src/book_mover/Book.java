package book_mover;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        setStatus(Status.AVAILABLE);
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
