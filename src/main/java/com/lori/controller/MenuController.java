package com.lori.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lori.dao.MenuDao;
import com.lori.pojo.mainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuDao menuDao;

    @RequestMapping("/menus")
    public String getMenu() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        List<mainMenu> menus = menuDao.getMenus();
        if (menus != null){
            res.put("status", 200);
        }else{
            res.put("status", 404);
        }
        res.put("menus", menus);
        String str = mapper.writeValueAsString(res);
        return str;
    }
}
