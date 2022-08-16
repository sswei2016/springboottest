package com.sdt.springboottest.contoller;

import com.sdt.springboottest.entity.Book;
import com.sdt.springboottest.repository.BookRespository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author weishanshan 2022/8/8
 */
@RestController
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookRespository bookRespository;

    @GetMapping("/findAll")
    @ApiOperation(value = "查找所有书籍", response = List.class, httpMethod = "GET")
    public List<Book> findAll(){
        System.out.println("hello");
        //log.info("wss log4j");
        return bookRespository.findAll();
    }
}
