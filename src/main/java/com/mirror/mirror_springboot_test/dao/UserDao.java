package com.mirror.mirror_springboot_test.dao;

import com.mirror.mirror_springboot_test.domain.User;

import java.util.List;

/**
 * 用户dao层接口
 */
public interface UserDao {

     List<User> findAllUser();
}
