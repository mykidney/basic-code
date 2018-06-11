package com.coder.utils;

import com.coder.entity.User;

public class VerifyUtil {
    public static boolean verifyLogin(String password, User user){
        if (user==null){
            return false;
        }else if(user.getPassword()!=null&&user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
