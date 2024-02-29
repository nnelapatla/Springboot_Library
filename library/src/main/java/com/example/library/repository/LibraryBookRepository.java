package com.example.library.repository;


import com.example.library.entity.LibraryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryBookRepository extends JpaRepository<LibraryBook, Integer> {

}