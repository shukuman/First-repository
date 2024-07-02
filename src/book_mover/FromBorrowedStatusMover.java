//package book_mover;
//
//import book_mover.Book;
//import book_mover.BookMover;
//
//public class FromBorrowedStatusMover extends BookMover {
//    @Override
//    protected void moveToStatus(Book book, Status requestedStatus) {
//        if (book.getStatus() != Status.BORROWED) {
//            System.out.println("Начальный статус книги не 'BORROWED'");
//        } else {
//            switch (requestedStatus) {
//                case Status.ARCHIVED -> book.setStatus(Status.ARCHIVED);
//                case Status.AVAILABLE -> book.setStatus(Status.AVAILABLE);
//                case Status.OVERDUED -> book.setStatus(Status.OVERDUED);
//            }
//        }
//    }
//}
