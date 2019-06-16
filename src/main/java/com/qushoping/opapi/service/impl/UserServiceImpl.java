package com.qushoping.opapi.service.impl;

import com.qushoping.opapi.pojo.User;
import com.qushoping.opapi.repository.UserRepository;
import com.qushoping.opapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yinguilong
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository _userRepository;

    @Override
    public List<User> findAll() {
        return  _userRepository.findAll();
    }

    @Override
    public User insert(User a) {
        return _userRepository.save(a);
    }

    @Override
    public User findOne(Long id) {
        return _userRepository.findById(id).orElse(null);
    }
}
