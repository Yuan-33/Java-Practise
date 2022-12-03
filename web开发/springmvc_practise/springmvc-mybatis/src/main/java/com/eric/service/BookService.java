package com.eric.service;

import com.eric.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    int addBook(Books book);

    int deleteBookById(@Param("bookId") int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();

}
