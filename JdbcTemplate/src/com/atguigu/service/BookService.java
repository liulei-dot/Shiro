package com.atguigu.service;

import com.atguigu.dao.BookDao;
import com.atguigu.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liulei
 * @create 2020-07-27 17:24
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public Integer addBook(Book book){
        return bookDao.addBook(book);
    }
    public Integer updateBook(Book book){
        return bookDao.updateBook(book);
    }
    public Integer deleteBook(Integer id){
        return bookDao.deleteBook(id);
    }
    public Integer getCount(){
        return bookDao.getCount();
    }
    public Book getBookById(Integer id){
        return bookDao.getBookById(id);
    }
    public List<Book> getAllBook(){
        return bookDao.getAllBook();
    }
    public int[] batchAdd(List<Object[]> args) {
        return bookDao.batchAdd(args);
    }
    public int[] batchUpdate(List<Object[]> args) {
        return bookDao.batchUpdate(args);
    }
    public int[] batchDelete(List<Object[]> args) {
        return bookDao.batchDelete(args);
    }
}
