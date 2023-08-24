package com.lori;

import com.lori.dao.UserDao;
import com.lori.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
//        userDao.addUser(new User(1,"admin", "123456", "admin@admin.com", "admin", 1));
    }

}
