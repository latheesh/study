package com.latheesh.study.book.rest;

import com.latheesh.study.book.model.Book;
import com.latheesh.study.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reading")
public class ReadingListController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public List<Book> getReadingList() {
        return bookService.findBooks();
    }

}
