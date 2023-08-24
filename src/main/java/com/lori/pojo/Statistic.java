package com.lori.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistic {
    private User user;
    private Book book;
    private float hours;
    private Date date;
    private String media;
}
