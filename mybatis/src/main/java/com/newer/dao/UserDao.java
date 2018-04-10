package com.newer.dao;

import com.newer.pojo.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int sid);

    User findById(int sid);

    List<User> findAll();
}
