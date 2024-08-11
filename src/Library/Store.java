package Library;

public class Store implements Supplier {

    @Override
    public void deliveryBook(String bookName) {
        System.out.printf("Книжный магазин доставил книгу %s\n", bookName);
    }
}
