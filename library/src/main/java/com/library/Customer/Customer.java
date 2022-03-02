package com.library.Customer;

import com.library.Loan.Loan;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    private Integer id;

    private String firstName;

    private String lastName;

    private String job;

    private String address;

    private String email;

    private LocalDate creationDate;

    Set<Loan> loans = new HashSet<>();

    public Customer() {
        super();
    }

    public Customer(Integer id, String firstName, String lastName, String job, String address, String email, LocalDate creationDate, Set<Loan> loans) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.address = address;
        this.email = email;
        this.creationDate = creationDate;
        this.loans = loans;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="FIRST_NAME",nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME",nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "JOB",nullable = false)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Column(name = "ADDRESS",nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "EMAIL",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "CREATION_DATE",nullable = false)
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pc.customer",cascade = CascadeType.ALL)
    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }

}
