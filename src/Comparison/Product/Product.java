package Comparison.Product;

public class Product {
    private String category;
    private String name;
    private int price;

    public Product(String category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "category: " + category + "; name: " + name + "; price: " + price + "\n";
    }
}
