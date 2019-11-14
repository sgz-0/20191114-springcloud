package com.aaa.xmz.springcloud.fallback;

import com.aaa.xmz.springcloud.model.Book;
import com.aaa.xmz.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IFallBackFactory
 * @Description
 * @Author sgz
 * @Date 2019/11/12 15:24
 * @Version 1.0
 **/
@Component
public class ISpringcloudFallBackFactory implements FallbackFactory<ISpringcloudService> {
    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<Book> selectAllBooks() {
                System.out.println("这是一个熔断方法测试");
                List<Book> bookList = new ArrayList<Book>();
                Book book = new Book();
                book.setId(100000000L);
                book.setBookName("测试熔断-->图书名称");
                book.setBookPrice(123.23);
                bookList.add(book);
                return bookList;


            }
        };
    }
}

 