package com.coder.action.user;

import com.coder.action.BaseAction;
import com.coder.dao.UserDao;
import com.coder.entity.User;
import com.coder.factory.DaoFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class UserLoginAction extends BaseAction {
    @Override
    public String jump(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDao = DaoFactory.getUserDao();
        Map<String,Object>userMap = userDao.selectByUsername(username);
        if(userMap!=null&&userMap.get("assword").equals(username)) {
            return "succ";
        }
        return null;
    }
}
