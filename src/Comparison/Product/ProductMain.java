package Comparison.Product;

import java.util.Arrays;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("fruit", "apple", 150),
                new Product("vegetable", "tomato", 200),
                new Product("vegetable", "potato", 90),
                new Product("drink", "pepsi", 100),
                new Product("meat", "beef", 500));

        PriceComparator priceComparator = new PriceComparator();
        productList.sort(priceComparator);
        System.out.println(productList);

        CategoryComparator categoryComparator = new CategoryComparator();
        productList.sort(categoryComparator);
        System.out.println(productList);
    }
}
