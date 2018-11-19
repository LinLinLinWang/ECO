package com.niit.dao;

import com.niit.entity.UsersAddress;

public interface UsersAddressMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(UsersAddress record);

    int insertSelective(UsersAddress record);

    UsersAddress selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(UsersAddress record);

    int updateByPrimaryKey(UsersAddress record);
}