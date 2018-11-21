package com.qushoping.opapi.service;

import com.qushoping.opapi.pojo.user;
import com.qushoping.opapi.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Service
public class userServiceImp implements userService {
    @Autowired
    private userRepository _userRepository;

    @Override
    public List<user> findAll() {
        return  _userRepository.findAll();
    }

    @Override
    public user insert(user a) {
        return _userRepository.save(a);
    }

    @Override
    public user findOne(Long id) {
        return _userRepository.findById(id).orElse(null);
    }
}
