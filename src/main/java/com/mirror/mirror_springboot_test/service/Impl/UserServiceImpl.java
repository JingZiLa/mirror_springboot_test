package com.mirror.mirror_springboot_test.service.Impl;

import com.mirror.mirror_springboot_test.dao.UserDao;
import com.mirror.mirror_springboot_test.domain.User;
import com.mirror.mirror_springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
