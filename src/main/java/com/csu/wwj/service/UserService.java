package com.csu.wwj.service;

import com.csu.wwj.model.UserEntity;

public interface UserService {
    UserEntity getUser(String name);
    void saveUser(UserEntity user);
}
