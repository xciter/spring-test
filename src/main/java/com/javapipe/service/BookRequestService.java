package com.javapipe.service;

import com.javapipe.entities.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookRequestService {

    public Book getBook();

}
