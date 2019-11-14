package com.aaa.xmz.springcloud.controller;

import com.aaa.xmz.springcloud.model.Book;
import com.aaa.xmz.springcloud.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author sgz
 * @Date 2019/11/12 15:19
 * @Version 1.0
 **/
@RestController

public class BookController {
    @Autowired
    private ISpringcloudService iSpringcloudService;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return iSpringcloudService.selectAllBooks();
    }
}

 