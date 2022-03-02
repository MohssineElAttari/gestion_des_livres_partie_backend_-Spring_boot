package com.library.Loan;

import com.library.Book.Book;
import com.library.Customer.Customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;
@Embeddable
public class LoanId implements Serializable {

    private Book book;

    private Customer customer;

    private LocalDateTime creationDateTime;

    public LoanId() {
        super();
    }

    public LoanId(Book book, Customer customer, LocalDateTime creationDateTime) {
        super();
        this.book = book;
        this.customer = customer;
        this.creationDateTime = creationDateTime;
    }

    @ManyToOne
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Column(name = "CREATION_DATE_TIME")

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

}
