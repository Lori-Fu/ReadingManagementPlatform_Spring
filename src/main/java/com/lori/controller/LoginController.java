package com.lori.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lori.dao.UserDao;
import com.lori.pojo.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user, HttpSession session) throws JsonProcessingException {
        String flag = "error";
        user = userDao.getUserByMessage(user.getUsername(), user.getPassword());
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        if (user != null) {
            flag = "ok";
        }
        res.put("flag", flag);
        res.put("user", user);
//        session.setAttribute("user", user);
        String str = mapper.writeValueAsString(res);
        return str;
    };

}
