package com.MuratBookStore.bookStore;

import com.MuratBookStore.bookStore.model.Book;
import com.MuratBookStore.bookStore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication

public class BookStoreApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(BookStoreApplication.class, args);}
	private final BookRepository booksRepository;
	public BookStoreApplication(BookRepository booksRepository) {
		this.booksRepository = booksRepository;
	}
	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder().name("Harry Potter").author("Jk Rowling").
				price(10.0)
				.stock(10)
				.id(1)
				.build();
		Book book2 = Book.builder().name("80 Günde Devri Alem").author("Jules Verne").
				price(32.2)
				.stock(40)
				.id(2)
				.build();
		Book book3 = Book.builder().name("Sefiller").author("Viktor Hugo").
				price(25.5)
				.stock(30)
				.id(3)
				.build();
		booksRepository.saveAll(Arrays.asList(book1, book2, book3));
	}
}
