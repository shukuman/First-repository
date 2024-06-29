package Bill2;

import java.math.BigDecimal;

public class BillTest {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("10000"), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal("10000"), new VATTaxType(), taxService),
                new Bill(new BigDecimal("10000"), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal("100000"), new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
