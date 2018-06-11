package com.coder.factory;

import com.coder.action.IAction;

public class ActionFactory {
    private static ActionFactory actionFactory = null;

    private ActionFactory() {

    }

    public static ActionFactory getActionFactory() {
        if (actionFactory == null) {
            return new ActionFactory();
        }
        return actionFactory;
    }

    public static IAction getAction(String classPath) {
        Class clazz = null;
        IAction action = null;
        try {
            clazz = Class.forName(classPath);
            action = (IAction) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            return action;
        }
    }
}
