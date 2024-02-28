package com.example.library.service;


import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;
import java.util.Random;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book updateBook(Integer bookId, Book updatedBook) {
        Optional<Book> existingBookOptional = bookRepository.findById(bookId);

        if (existingBookOptional.isPresent()) {
            Book existingBook = existingBookOptional.get();
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setYear_published(updatedBook.getYear_published());
            // existingBook.setisbn(updatedBook.getIsbn());
            return bookRepository.save(existingBook);
        } else {
            return null;
        }
    }

    public void deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
    }

    public Book createBook(Book book) {

        Integer bookId = new Random().nextInt();
        book.setBookId(bookId);
        return bookRepository.save(book);
    }

    public Book getBook(Integer bookId) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        return bookOptional.orElse(new Book());
    }
}