package com.atguigu.test;

import com.atguigu.domain.Book;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Liulei
 * @create 2020-07-28 9:25
 */
public class BookServiceTest {
    private static BookService bookService;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        bookService = context.getBean("bookService", BookService.class);
    }
    @Test
    public void addBook(){
        Book book = new Book(null, "tcp/ip","刘三", new BigDecimal(70.5), 100, 2000, "default");
        bookService.addBook(book);

    }
    @Test
    public void updateBook(){
        Book book = new Book(31, "tcp/ip","lifnafa", new BigDecimal(100.5), 100, 2000, "default");
        bookService.updateBook(book);

    }
    @Test
    public void deleteBook(){
        bookService.deleteBook(33);

    }
    @Test
    public void getCount(){
        System.out.println(bookService.getCount());

    }
    @Test
    public void getBookById(){
        System.out.println(bookService.getBookById(30));

    }
    @Test
    public void getAllBook(){
        System.out.println(bookService.getAllBook());

    }
    @Test
    public void batchAdd(){
        List<Object[]> args=new ArrayList<>();
        Object[] o1={"tcp/ip","刘三1", new BigDecimal(70.5), 100, 2000, "default"};
        Object[] o2={"tcp/ip","刘三2", new BigDecimal(70.5), 100, 2000, "default"};
        Object[] o3={"tcp/ip","刘三3", new BigDecimal(70.5), 100, 2000, "default"};
        args.add(o1);
        args.add(o2);
        args.add(o3);
        System.out.println(Arrays.toString(bookService.batchAdd(args)));

    }
    @Test
    public void batchUpdate(){
        List<Object[]> args=new ArrayList<>();
        Object[] o1={"tcp/ip","刘1", new BigDecimal(70.5), 100, 2000, "default",36};
        Object[] o2={"tcp/ip","刘2", new BigDecimal(70.5), 100, 2000, "default",37};
        Object[] o3={"tcp/ip","刘3", new BigDecimal(70.5), 100, 2000, "default",38};
        args.add(o1);
        args.add(o2);
        args.add(o3);
        System.out.println(Arrays.toString(bookService.batchUpdate(args)));

    }
    @Test
    public void batchDelete(){
        List<Object[]> args=new ArrayList<>();
        args.add(new Object[]{36});
        args.add(new Object[]{37});
        args.add(new Object[]{38});
        System.out.println(Arrays.toString(bookService.batchDelete(args)));

    }
}