package com.atguigu.dao;

import com.atguigu.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liulei
 * @create 2020-07-27 17:23
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer addBook(Book book) {
        String sql="insert into t_book(name,author,price,sales,stock,img_path) values(?,?,?,?,?,?)";
        //增删改用这个方法
        return jdbcTemplate.update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImgPath());
    }

    @Override
    public Integer updateBook(Book book) {
        String sql="update t_book set name=?,author=?,price=?,sales=?,stock=?,img_path=? where id=?";
        //增删改用这个方法
        return jdbcTemplate.update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImgPath(),book.getId());
    }

    @Override
    public Integer deleteBook(Integer id) {
        String sql="delete from t_book where id=?";
        //增删改用这个方法
        return jdbcTemplate.update(sql,id);
    }

    //查询返回记录条数
    @Override
    public Integer getCount() {
        String sql="select count(*) from t_book";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    //根据id，查询图书详细信息
    @Override
    public Book getBookById(Integer id) {
        //sql语句查询字段要与实体相对应，驼峰命名可以自动识别，如果名字不一致，会是默认值，可以使用别名让不一致的变为一致；例img_path as img会出现查询数据imgPath='null'
        String sql="select id,name,author,price,sales,stock,img_path from t_book where id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //返回所有图书信息
    @Override
    public List<Book> getAllBook() {
        String sql="select id,name,author,price,sales,stock,img_path from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    //批量添加图书记录
    @Override
    public int[] batchAdd(List<Object[]> args) {
        String sql="insert into t_book(name,author,price,sales,stock,img_path) values(?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql,args);
    }
    //批量修改图书记录
    @Override
    public int[] batchUpdate(List<Object[]> args) {
        String sql="update t_book set name=?,author=?,price=?,sales=?,stock=?,img_path=? where id=?";
        return jdbcTemplate.batchUpdate(sql,args);
    }
    //批量删除图书记录
    @Override
    public int[] batchDelete(List<Object[]> args) {
        String sql="delete from t_book where id=?";
        return jdbcTemplate.batchUpdate(sql,args);
    }
}
