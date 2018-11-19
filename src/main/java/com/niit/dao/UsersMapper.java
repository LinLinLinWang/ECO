package com.niit.dao;

import com.niit.entity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(String uphone);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String uphone);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}