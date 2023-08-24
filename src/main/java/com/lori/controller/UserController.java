package com.lori.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lori.dao.UserDao;
import com.lori.pojo.QueryInfo;
import com.lori.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/allUser")
    public String getAllUser(QueryInfo queryInfo) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        int count = userDao.getUserCount("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<User> allUser = userDao.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        res.put("allUser", allUser);
        res.put("count", count);
        String str = mapper.writeValueAsString(res);
        return str;
    }

    @RequestMapping("/userStatus")
    public String updateUserState(@RequestParam("id") int id, @RequestParam("status") boolean status){
        int i = userDao.updateStatus(id, status);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        user.setRole("user");
        user.setStatus(false);
        int i = userDao.addUser(user);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        int i = userDao.deleteUser(id);
        return i > 0 ? "success" : "error";
    }
    
    @RequestMapping("/getUser")
    public String getUserById(int id) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> res = new HashMap<>();
        User user = userDao.getUserById(id);
        res.put("user", user);
        String str = mapper.writeValueAsString(res);
        return str;
    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        int i = userDao.updateUser(user);
        return i > 0 ? "success" : "error";
    }
}
