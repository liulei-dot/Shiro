package com.atguigu.dao;

import com.atguigu.domain.Book;

import java.util.List;

/**
 * @author Liulei
 * @create 2020-07-27 17:23
 */
public interface BookDao {
    Integer addBook(Book book);
    Integer updateBook(Book book);
    Integer deleteBook(Integer id);
    Integer getCount();
    Book getBookById(Integer id);
    List<Book> getAllBook();
    int[] batchAdd(List<Object[]> args);
    int[] batchUpdate(List<Object[]> args);
    int[] batchDelete(List<Object[]> args);
}
