package com.MuratBookStore.bookStore.repository;

import com.MuratBookStore.bookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories(basePackageClasses = BookRepository.class)
public interface BookRepository extends JpaRepository<Book, Integer> {}
