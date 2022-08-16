package com.sdt.springboottest.repository;

import com.sdt.springboottest.SpringboottestApplication;
import com.sdt.springboottest.SpringboottestApplicationTests;
import com.sdt.springboottest.repository.BookRespository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author weishanshan 2022/8/7
 */
@SpringBootTest
public class BookRespositoryTest {

    //使用@autowird不行
    @Autowired
    public BookRespository bookRespository;

    @Test
    void findAll(){

        System.out.println("wss:" + bookRespository.findAll());
    }
}
