package com.coder.action.user;

import com.coder.action.BaseAction;
import com.coder.action.IAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction extends BaseAction {
    @Override
    public String jump(HttpServletRequest request, HttpServletResponse response) {

        return "succ";
    }
}
