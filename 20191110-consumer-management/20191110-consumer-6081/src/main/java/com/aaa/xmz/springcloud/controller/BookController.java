package com.aaa.xmz.springcloud.controller;

import com.aaa.xmz.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author sgz
 * @Date 2019/11/10 18:08
 * @Version 1.0
 **/
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping ("/all")
    public List<Book> selectAllBooks(){
    return restTemplate.getForObject("http://localhost:8081/all",List.class);
    }
}
