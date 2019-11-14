package com.aaa.xmz.springcloud.controller;

import com.aaa.xmz.springcloud.model.Book;
import com.aaa.xmz.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author sgz
 * @Date 2019/11/10 18:03
 * @Version 1.0
 **/
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public List<Book> getAllBooks(){

        System.out.println("8081");
        return bookService.selectAll();
    }

}
