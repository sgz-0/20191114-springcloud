package com.aaa.xmz.springcloud.controller;

import com.aaa.xmz.springcloud.model.Book;
import com.aaa.xmz.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author sgz
 * @Date 2019/11/11 20:44
 * @Version 1.0
 **/
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        System.out.println("8082");
        return bookService.selectAll();
    }
}

 