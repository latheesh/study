package com.latheesh.study.book.service;

import com.latheesh.study.book.model.Book;
import com.latheesh.study.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }
}
