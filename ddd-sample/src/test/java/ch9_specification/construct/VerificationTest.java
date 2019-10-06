package ch9_specification.construct;

import ch9_specification.verification.Customer;
import ch9_specification.verification.DelinquentService;
import ch9_specification.verification.Invoice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class VerificationTest {

    @DisplayName("顧客が支払期限をすぎた請求書を持っているか判定")
    @Test
    void test01() {
        // Arrange
        DelinquentService target = new DelinquentService();
        // 基準日
        LocalDate referenceDate = LocalDate.of(2019,10,13);
        // customerにインボイスをセット
        List<Invoice> invoices = new ArrayList<>();
        // 請求日が４日前
        Invoice invoice1 = new Invoice(referenceDate.minusDays(4));
        // 請求日が３日前
        Invoice invoice2 = new Invoice(referenceDate.minusDays(3));
        // 請求日が２日前
        Invoice invoice3 = new Invoice(referenceDate.minusDays(1));
        // 請求日が６日前
        Invoice invoice4 = new Invoice(referenceDate.minusDays(6));
        invoices.add(invoice1);
        invoices.add(invoice2);
        invoices.add(invoice3);
        invoices.add(invoice4);

        // この客は支払期限から５日間猶予がある
        // つまりInvoiceの請求日＋５日がDeadline
        Customer customer = new Customer(invoices, 5);

        // Act
        // 一つでもDeadlineをすぎたインボイスがあったらtrue
        boolean result = target.accountIsDelinquent(customer, referenceDate);

        // Assert
        // 滞納したinvoiceがあればtrue
        assertThat(result).isTrue();
    }

}
