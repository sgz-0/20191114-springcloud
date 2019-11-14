package com.aaa.xmz.springcloud.controller;

import com.aaa.xmz.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author sgz
 * @Date 2019/11/11 21:04
 * @Version 1.0
 **/
@RestController
public class BookController {
    private static final String URL = "http://BOOK-PROVIDER/";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject(URL+"all",List.class);
    }
}

 