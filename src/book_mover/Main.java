package book_mover;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        System.out.println(book.getStatus());

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());

        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

        fromArchivedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
    }
}