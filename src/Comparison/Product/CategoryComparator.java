package Comparison.Product;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        int categoryComparing = o1.getCategory().compareTo(o2.getCategory());
        int priceComparing = o1.getPrice() - o2.getPrice();
        int nameComparing = o1.getName().compareTo(o2.getName());

        if (categoryComparing == 0) {
            if (priceComparing == 0) {
                return nameComparing;
            }
            return -(priceComparing);
        }
        return categoryComparing;
    }
}
