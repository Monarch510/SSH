package com.csu.wwj.dao;

import com.csu.wwj.model.User;

public interface UserDao {
    User getUser(String name);
    void savaUser(User user);
}
