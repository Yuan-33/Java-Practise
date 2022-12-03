package com.eric.dao;

import com.eric.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Books book);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();

}
