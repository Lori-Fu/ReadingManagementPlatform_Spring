package com.lori.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lori.dao.StatisticDao;
import com.lori.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class StatisticController {

    @Autowired
    StatisticDao statisticDao;

    @RequestMapping("/getDAU")
    public String getDAU() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        List<DAU> dau = statisticDao.getDAU();
        res.put("dau", dau);
        String str = mapper.writeValueAsString(res);
        return str;
    }

    @RequestMapping("/getGenre")
    public String getGenre() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        List<Genre> genre = statisticDao.getGenre();
        res.put("genre", genre);
        String str = mapper.writeValueAsString(res);
        return str;
    }

    @RequestMapping("/getMedia")
    public String getMedia() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        List<Media> media = statisticDao.getMedia();
        res.put("media", media);
        String str = mapper.writeValueAsString(res);
        return str;
    }

    @RequestMapping("/getBookRank")
    public String getBookRank() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        List<BookRank> bookRank = statisticDao.getBookRank();
        res.put("rank", bookRank);
        String str = mapper.writeValueAsString(res);
        return str;
    }

    @RequestMapping("/getAuthorRank")
    public String getAuthorRank() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        List<AuthorRank> authorRank = statisticDao.getAuthorRank();
        res.put("rank", authorRank);
        String str = mapper.writeValueAsString(res);
        return str;
    }
}
