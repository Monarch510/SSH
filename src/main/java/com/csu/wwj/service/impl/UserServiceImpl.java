package com.csu.wwj.service.impl;

import com.csu.wwj.dao.UserDao;
import com.csu.wwj.model.UserEntity;
import com.csu.wwj.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    // 注入事物管理
    @Transactional(rollbackFor = {Exception.class, RuntimeException.class})
    public UserEntity getUser(String name) {
        return userDao.getUser(name);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class, RuntimeException.class})
    public void saveUser(UserEntity user) {
        userDao.savaUser(user);
    }
}
