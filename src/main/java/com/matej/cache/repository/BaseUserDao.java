package com.matej.cache.repository;

import com.matej.cache.entity.BaseUserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseUserDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(BaseUserEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(BaseUserEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    BaseUserEntity selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BaseUserEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(BaseUserEntity record);
}