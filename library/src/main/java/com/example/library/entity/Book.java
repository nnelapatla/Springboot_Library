package com.example.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name="book")
@Entity
@Data
public class Book{

    @Id
    @Column(name="book_id")
    private Integer bookId;

    @Column(name="title")
    private String title;

    @Column(name="author_name")
    private String author;

    @Column(name="year_published")
    private Integer year_published;

    @Column(name="quantity")
    private Integer quantity;
}