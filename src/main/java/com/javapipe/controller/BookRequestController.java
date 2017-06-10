package com.javapipe.controller;

import com.javapipe.service.BookRequestService;
import com.javapipe.service.impl.BookRequestServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping
public class BookRequestController {

    @Resource
    private BookRequestService bookService = new BookRequestServiceImpl();

    @RequestMapping (value = "/book", method = RequestMethod.GET)
    public String getBookInfo(Model model) {
        model.addAttribute("bookInfo", bookService.getBook());
        return "book";
    }

}
