package Bill;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount >= 100000 ? (amount * 0.15) : (amount * 0.10);
    }
}
