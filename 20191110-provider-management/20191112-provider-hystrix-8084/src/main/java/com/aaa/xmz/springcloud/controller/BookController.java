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
 * @Date 2019/11/12 15:32
 * @Version 1.0
 **/
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAllBooks() throws Exception{
        List<Book> bookList = bookService.selectAll();
        if (bookList.size()>0){
            throw new Exception("模拟异常,熔断异常");
        }return bookList;
    }
}

 