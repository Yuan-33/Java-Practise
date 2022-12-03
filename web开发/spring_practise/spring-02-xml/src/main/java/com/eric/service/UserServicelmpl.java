package com.eric.service;

import com.eric.dao.UserDao;
import com.eric.dao.UserDaolmpl1;

public class UserServicelmpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getName() {
        userDao.getUser();
    }
}
