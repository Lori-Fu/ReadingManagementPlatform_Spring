package com.lori.dao;

import com.lori.pojo.mainMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuDao {
    public List<mainMenu> getMenus();
}
