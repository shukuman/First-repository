package Enum;

public class CountryTest {
    public static void main(String[] args) {
        Country country1 = Country.CANADA;
        Country country2 = Country.USA;
        Country country3 = Country.GERMANY;

        System.out.println(country1.getCurrency());
        System.out.println(country2.getCurrency());
        System.out.println(country3.getCurrency());

        for(Country country : Country.values()) {
            System.out.println(country + ": " + country.getCurrency() + " " + country.getPrice());
        }
    }
}
