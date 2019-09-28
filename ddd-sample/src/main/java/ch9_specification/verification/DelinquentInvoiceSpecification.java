package ch9_specification.verification;

import java.time.LocalDate;

/**
 * 延滞請求書
 * ValueObjdct
 */
public class DelinquentInvoiceSpecification implements InvoiceSpecification{
    private LocalDate currentDate;

    public DelinquentInvoiceSpecification(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public boolean isSatisifiedBy(Invoice candidate) {
        // 猶予期間
        int gracePeriod = candidate.customer().getPaymentGracePeriod();

        // 最終期限
        LocalDate firmDeadLine = candidate.getDueDate().plusDays(gracePeriod);
        return currentDate.isAfter(firmDeadLine);
    }

    @Override
    public String asSql() {
        return null;
    }
}
