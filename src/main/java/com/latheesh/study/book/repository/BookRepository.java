package com.latheesh.study.book.repository;

import com.latheesh.study.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
