package Bill2;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return new BigDecimal("0.13").multiply(amount);
    }
}
