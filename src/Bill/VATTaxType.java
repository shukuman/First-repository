package Bill;

public class VATTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
