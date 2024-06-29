package Bill;

public class BillTest {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(10000, new IncomeTaxType(), taxService),
                new Bill(10000, new VATTaxType(), taxService),
                new Bill(10000, new ProgressiveTaxType(), taxService),
                new Bill(100000, new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
