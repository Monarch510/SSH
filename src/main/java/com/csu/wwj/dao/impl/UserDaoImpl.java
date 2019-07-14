package com.csu.wwj.dao.impl;

import com.csu.wwj.dao.UserDao;
import com.csu.wwj.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public User getUser(String name) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class, name);
        return user;
    }

    @Override
    public void savaUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }
}
