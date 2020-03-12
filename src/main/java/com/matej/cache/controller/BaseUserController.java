package com.matej.cache.controller;

import com.matej.cache.entity.BaseUserEntity;
import com.matej.cache.service.BaseUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BaseUserController {

    @Resource
    private BaseUserService baseUserService;

    @GetMapping("/user")
    public BaseUserEntity selectByUser(@RequestParam("userId") Long userId) {
        return baseUserService.selectById(userId);
    }
}
