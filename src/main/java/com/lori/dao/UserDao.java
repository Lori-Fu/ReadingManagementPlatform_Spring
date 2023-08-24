package com.lori.dao;

import com.lori.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    public User getUserByMessage(@Param("username") String username, @Param("password")String password);
    public List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    public int getUserCount(@Param("username") String username);
    public int addUser(User user);
    public int updateStatus(int id, boolean status);
    public int deleteUser(int id);
    public User getUserById(int id);
    public int updateUser(User user);
}
