package book_mover;

public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.ARCHIVED) {
            System.out.println("Начальный статус книги не 'ARCHIVED'");
        } else {
            switch (requestedStatus) {
                case AVAILABLE -> book.setStatus(Status.AVAILABLE);
                case BORROWED -> System.out.println("Перевод книги из статуса 'ARCHIVED' в статус 'BORROWED' невозможен");
                case OVERDUED -> System.out.println("Перевод книги из статуса 'ARCHIVED' в статус 'OVERDUED' невозможен");
            }
        }
    }
}
