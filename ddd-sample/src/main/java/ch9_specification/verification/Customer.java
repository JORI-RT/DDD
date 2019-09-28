package ch9_specification.verification;

import java.util.List;

public class Customer {

    public List<Invoice> getInvoices() {
        return invoices;
    }

    private List<Invoice> invoices;

    private int paymentGracePeriod;

    public int getPaymentGracePeriod() {
        return 1;
    }


}
