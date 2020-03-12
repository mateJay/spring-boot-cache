package com.matej.cache.service;

import com.matej.cache.entity.BaseUserEntity;
import com.matej.cache.repository.BaseUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BaseUserService {

    @Resource
    private BaseUserDao baseUserDao;

    private Logger logger = LoggerFactory.getLogger(BaseUserService.class);

    @Cacheable(cacheNames = "baseUser", key = "#userId")
    public BaseUserEntity selectById(Long userId) {
        logger.info("进入方法查找");
        return baseUserDao.selectByPrimaryKey(userId);
    }

    @CachePut(cacheNames = "baseUser", key = "#baseUser.getId()")
    public BaseUserEntity update(BaseUserEntity baseUser) {
        logger.info("update用户信息");
        baseUserDao.updateByPrimaryKeySelective(baseUser);

        return baseUserDao.selectByPrimaryKey(baseUser.getId());
    }
}
