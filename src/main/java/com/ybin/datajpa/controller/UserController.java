package com.ybin.datajpa.controller;

import com.ybin.datajpa.entity.User;
import com.ybin.datajpa.repository.UserRepository;
import com.ybin.support.utils.ChainSpecification;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class UserController {
    UserRepository userRepository;

    @GetMapping("get/user")
    public Page<User> getUser(User user) {
        return userRepository.findAll(
                ChainSpecification.example(user), PageRequest.of(1,10, Sort.by(Sort.Order.asc("id")))
        );
    }

    @GetMapping("post/user")
    public User insertUser(User user) {
        userRepository.save(user);
        return userRepository.findById(user.getId()).orElseThrow(RuntimeException::new);
    }
}
