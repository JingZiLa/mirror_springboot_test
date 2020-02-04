package com.mirror.mirror_springboot_test.service;

import com.mirror.mirror_springboot_test.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();
}
