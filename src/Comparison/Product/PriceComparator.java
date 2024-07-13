package Comparison.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return -(o1.getPrice() - o2.getPrice());
    }
}
