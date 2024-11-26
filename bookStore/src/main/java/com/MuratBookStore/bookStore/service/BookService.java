package com.MuratBookStore.bookStore.service;

import com.MuratBookStore.bookStore.model.Book;
import com.MuratBookStore.bookStore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Optional<Book> findBookByİd(Integer bookId){
        return bookRepository.findById(bookId);
    }
}
