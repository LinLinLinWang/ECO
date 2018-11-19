package com.niit.dao;

import com.niit.entity.ProjectComment;

public interface ProjectCommentMapper {
    int deleteByPrimaryKey(Integer pcid);

    int insert(ProjectComment record);

    int insertSelective(ProjectComment record);

    ProjectComment selectByPrimaryKey(Integer pcid);

    int updateByPrimaryKeySelective(ProjectComment record);

    int updateByPrimaryKey(ProjectComment record);
}