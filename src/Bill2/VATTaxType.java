package Bill2;

import java.math.BigDecimal;

public class VATTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return new BigDecimal("0.18").multiply(amount);
    }
}
