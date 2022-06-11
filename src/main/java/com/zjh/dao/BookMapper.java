package com.zjh.dao;

import com.zjh.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //    增
    int addBook(Books books);

    //    删
    int deleteBookById(@Param("bookID") int id);

    //    改
    int updateBook(Books books);

    //    查
    Books queryById(@Param("bookID") int id);

    //    查所有
    List<Books> queryAllBooks();

    //    模糊查询
    List<Books> queryBookByName(@Param("bookName") String name);

}
