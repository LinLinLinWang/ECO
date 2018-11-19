package com.niit.dao;

import com.niit.entity.UsersInfo;

public interface UsersInfoMapper {
    int deleteByPrimaryKey(String uphone);

    int insert(UsersInfo record);

    int insertSelective(UsersInfo record);

    UsersInfo selectByPrimaryKey(String uphone);

    int updateByPrimaryKeySelective(UsersInfo record);

    int updateByPrimaryKey(UsersInfo record);
}