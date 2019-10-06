package ch9_specification.verification;

import java.time.LocalDate;

public class Invoice {
    private Customer customer;

    public Invoice(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    private LocalDate dueDate;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    Customer customer() {
        return this.customer;
    }

    LocalDate getDueDate() {
        return this.dueDate;
    }
}
