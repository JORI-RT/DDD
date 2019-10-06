package ch9_specification.verification;

import java.util.List;

public class Customer {

    public Customer(List<Invoice> invoices, int paymentGracePeriod) {
        this.paymentGracePeriod = paymentGracePeriod;
        invoices.forEach(invoice -> invoice.setCustomer(this));
        this.invoices = invoices;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    /**
     * 請求書たち
     */
    private List<Invoice> invoices;

    /**
     * 支払猶予日数
     */
    private int paymentGracePeriod;

    public int getPaymentGracePeriod() {
        return paymentGracePeriod;
    }


}
