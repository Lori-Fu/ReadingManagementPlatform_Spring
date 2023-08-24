package com.lori.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRank {
    private int id;
    private String bookname;
    private String author;
    private int count;
}
