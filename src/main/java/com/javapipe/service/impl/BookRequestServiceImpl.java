package com.javapipe.service.impl;


import com.javapipe.entities.Book;
import com.javapipe.service.BookRequestService;
import org.springframework.stereotype.Component;

@Component
public class BookRequestServiceImpl implements BookRequestService{

    public Book getBook() {
        return new Book("Book title", "Author name");
    }
}
