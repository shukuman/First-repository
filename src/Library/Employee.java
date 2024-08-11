package Library;

public class Employee implements Administrator, Librarian {

    @Override
    public void giveBook(Reader reader, String bookName) {
        System.out.printf(
                "Администратор выдал книгу %s читателю %s\n",
                bookName, reader.getName()
        );
    }

    @Override
    public void orderBook(Supplier supplier, String bookName) {
        System.out.printf(
                "Библиотекарь заказал книгу %s у поставщика\n", bookName
        );
        supplier.deliveryBook(bookName);
    }
}
