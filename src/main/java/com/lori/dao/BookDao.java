package com.lori.dao;

import com.lori.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookDao {
    public int addBook(Book book);
}
