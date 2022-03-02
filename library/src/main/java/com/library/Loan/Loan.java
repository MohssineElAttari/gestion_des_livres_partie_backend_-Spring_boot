package com.library.Loan;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "LOAN")
@Entity
public class Loan implements Serializable {

    private LoanId pk = new LoanId();

    private LocalDate beginDate;

    private LocalDate endDate;

    private LoanStatus status;


    public Loan() {
        super();
    }

    public Loan(LoanId pk, LocalDate beginDate, LocalDate endDate, LoanStatus status) {
        this.pk = pk;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.status = status;
    }
    @EmbeddedId
    public LoanId getPk() {
        return pk;
    }

    public void setPk(LoanId pk) {
        this.pk = pk;
    }
    @Column(name = "BEGIN_DATE", nullable = false)
    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    @Column(name = "END_DATE", nullable = false)
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}
