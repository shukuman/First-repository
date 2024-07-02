package book_mover;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.println("Начальный статус книги не 'AVAILABLE'");
        } else {
            switch (requestedStatus) {
                case ARCHIVED -> book.setStatus(Status.ARCHIVED);
                case BORROWED -> book.setStatus(Status.BORROWED);
                case OVERDUED -> System.out.println("Перевод книги из статуса 'AVAILABLE' в статус 'OVERDUED' невозможен");
            }
        }
    }
}
