package com.csu.wwj.dao;

import com.csu.wwj.model.UserEntity;

public interface UserDao {
    UserEntity getUser(String name);
    void savaUser(UserEntity user);
}
