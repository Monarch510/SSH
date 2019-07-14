package com.csu.wwj.service;

import com.csu.wwj.model.User;

public interface UserService {
    User getUser(String name);
    void saveUser(User user);
}
