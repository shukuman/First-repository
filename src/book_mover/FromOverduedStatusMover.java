package book_mover;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.OVERDUED) {
            System.out.println("Начальный статус книги не 'OVERDUED'");
        } else {
            switch (requestedStatus) {
                case ARCHIVED -> book.setStatus(Status.ARCHIVED);
                case AVAILABLE -> book.setStatus(Status.AVAILABLE);
                case BORROWED -> System.out.println("Перевод книги из статуса 'OVERDUED' в статус 'BORROWED' невозможен");
            }
        }
    }
}
