package Bill2;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (new BigDecimal("100000").compareTo(amount) <= 0) {
            return new BigDecimal("0.15").multiply(amount);
        } else {
            return new BigDecimal("0.10").multiply(amount);
        }
    }
}
