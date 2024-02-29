package com.example.library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name= "book_isbn")
@Entity
@Data
public class BookIsbn {
    @Id
    private Long isbn;
    @Column(name = "book_id", insertable = false, updatable = false)
    private Integer bookId;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private LibraryBook libraryBook;
}