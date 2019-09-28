package ch9_specification.verification;

import java.time.LocalDate;

public class Invoice {
    private Customer customer;
    private LocalDate dueDate;

    Customer customer() {
        return this.customer;
    }
    LocalDate getDueDate() {
        return this.dueDate;
    }
}
