package com.qushoping.opapi.service;

import com.qushoping.opapi.pojo.User;

import java.util.List;

/**
 * @author yinguilong
 */
public interface UserService {
    List<User> findAll();
    User insert(User a);
    User findOne(Long id);
}
