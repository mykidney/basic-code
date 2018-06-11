package com.coder.utils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

public class RequestParamToEntity {
    public static <T>T  convert(HttpServletRequest request,Class <T> clazz){
        T entity= null;
        try {
            entity = clazz.newInstance();
            Field []fields=clazz.getDeclaredFields();
            for (Field field:fields){
                field.setAccessible(true);
                String value=request.getParameter(field.getName());
                String type=field.getType().getName();
                if(value!=null){
                    switch (type){
                        case "byte":
                            field.setByte(entity,Byte.parseByte(value));
                            break;
                        case "short":
                            field.setShort(entity,Short.parseShort(value));
                        case "int":
                            field.setInt(entity,Integer.parseInt(value));
                        case "float":
                            field.setFloat(entity,Float.parseFloat(value));
                        case "double":
                            field.setDouble(entity,Double.parseDouble(value));
                        case "char":
                            field.setChar(entity,value.charAt(0));
                        default:
                            field.set(entity,value);
                    }
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }
}
