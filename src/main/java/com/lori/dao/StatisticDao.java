package com.lori.dao;

import com.lori.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StatisticDao {
//    public int addRecord(Statistic statistic);
    public List<DAU> getDAU();
    public List<Genre> getGenre();
    public List<Media> getMedia();

    public List<BookRank> getBookRank();

    public List<AuthorRank> getAuthorRank();
}
