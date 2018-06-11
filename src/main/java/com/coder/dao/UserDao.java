package com.coder.dao;

import com.coder.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    void regist(User user);

    void delete();

    void update();

    Map<String, Object> selectByUsername(String username);

    List<User> selectAll();
}
