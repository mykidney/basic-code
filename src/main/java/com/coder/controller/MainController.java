package com.coder.controller;

import com.coder.action.IAction;
import com.coder.factory.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("*.do")
public class MainController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        String[] array = servletPath.split("[/.]");
        String packagePath = array[1];
        String className = array[2];
        String classPath = "com.coder.action." + array[1] +"."+ array[2];
        IAction action = ActionFactory.getAction(classPath);
        req.getRequestDispatcher("../WEB-INF/pages/" + action.jump(req, resp) + ".jsp").forward(req,resp);
    }
}
