package com.zjh.service;

import com.zjh.dao.BookMapper;
import com.zjh.pojo.Books;

import java.util.List;


public class BookServiceImpl implements BookService {

    //    service调dao层
    private BookMapper bookMapper;

    //    控制反转
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryById(int id) {
        return bookMapper.queryById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public List<Books> queryBookByName(String name) {
        return bookMapper.queryBookByName(name);
    }
}
