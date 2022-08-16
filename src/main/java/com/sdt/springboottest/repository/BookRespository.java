package com.sdt.springboottest.repository;

import com.sdt.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author weishanshan 2022/8/7
 */
public interface BookRespository extends JpaRepository<Book,Integer> {
}
