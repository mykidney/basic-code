package com.coder.dao.impl;

import com.coder.dao.UserDao;
import com.coder.entity.User;
import com.coder.utils.JdbcUtil;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private static JdbcUtil jdbcUtil=JdbcUtil.getJdbcUtil();

    @Override
    public void regist(User user) {
        String sql="INSERT INTO user(username,password,email,head)VALUES('"+user.getUsername()+"'," +
                "'"+user.getPassword()+"','"+user.getEmail()+"','"+user.getHead()+"')";
        jdbcUtil.update(sql);
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public Map<String,Object> selectByUsername(String username) {
        String sql="SELECT username,password,email,head FROM user WHERE username='"+username+"'";
        List userList=jdbcUtil.query(sql);
        return userList==null?null: (Map<String, Object>) userList.get(0);
    }

    @Override
    public List<User> selectAll() {
        String sql="SELECT username,password,email,head FROM user";
        List<User>userList=jdbcUtil.query(sql);
        return userList;
    }
}
