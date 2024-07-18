package Enum;

public enum Country {
    CANADA("CAD", 200),
    USA("USD", 100),
    GERMANY("EUR", 50);

    private final String currency;
    private final int price;

    Country(String currency, int price) {
        this.currency = currency;
        this.price = price;
    }
    public String getCurrency() {
        return currency;
    }
    public int getPrice() {
        return price;
    }
}
