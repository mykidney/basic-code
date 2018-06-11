package com.coder.factory;

import com.coder.dao.UserDao;
import com.coder.dao.impl.UserDaoImpl;
import com.coder.entity.User;

public class DaoFactory  {
    private static UserDaoImpl userDaoImpl=null;
    public static UserDao getUserDao() {
        if (userDaoImpl == null) {
            return new UserDaoImpl();
        }
        return userDaoImpl;
    }
}
