package com.qushoping.opapi.service;

import com.qushoping.opapi.pojo.user;

import java.util.List;

public interface userService {
    List<user> findAll();
    user  insert(user a);
    user findOne(Long id);
}
