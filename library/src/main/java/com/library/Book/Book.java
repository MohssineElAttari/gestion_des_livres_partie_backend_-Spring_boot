package com.library.Book;

import com.library.Category.Category;
import com.library.Loan.Loan;
import org.springframework.data.util.Lazy;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="BOOK")
public class Book {

    private Integer id;

    private String ISBN;

    private String title;

    private LocalDate releaseDate;

    private LocalDate registerDate;

    private Integer totaleExamplaires;

    private String author;

    private Category category;

    Set<Loan> loans = new HashSet<Loan>();

    public Book() {
        super();
    }

    public Book(Integer id, String ISBN, String title, LocalDate releaseDate, LocalDate registerDate, Integer totaleExamplaires, String author, Category category, Set<Loan> loans) {
        super();
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;
        this.releaseDate = releaseDate;
        this.registerDate = registerDate;
        this.totaleExamplaires = totaleExamplaires;
        this.author = author;
        this.category = category;
        this.loans = loans;
    }

    @Id
    @Column(name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ISBN" ,nullable = false , unique = true )
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Column(name = "TITLE" ,nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="RELEASE_DATE" , nullable = false)
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Column(name = "REGISTER_DATE" ,nullable = false)
    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
    @Column(name = "TOTALE_EXEMPLAIRES" ,nullable = false)
    public Integer getTotaleExamplaires() {
        return totaleExamplaires;
    }

    public void setTotaleExamplaires(Integer totaleExamplaires) {
        this.totaleExamplaires = totaleExamplaires;
    }

    @Column(name="AUTHOR",nullable = false)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "CAT_CODE",referencedColumnName = "CODE")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.book", cascade = CascadeType.ALL)
    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }
}
