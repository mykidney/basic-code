package com.coder.action.user;

import com.coder.action.BaseAction;
import com.coder.dao.UserDao;
import com.coder.entity.User;
import com.coder.factory.DaoFactory;
import com.coder.utils.RequestParamToEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegistAction extends BaseAction {
    @Override
    public String jump(HttpServletRequest request, HttpServletResponse response) {
        UserDao userDao=DaoFactory.getUserDao();
        User user=RequestParamToEntity.convert(request,User.class);
        userDao.regist(user);
        return "succ";
    }
}
