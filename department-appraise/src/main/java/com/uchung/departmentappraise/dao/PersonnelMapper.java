package com.uchung.departmentappraise.dao;

import com.uchung.departmentappraise.model.Personnel;

public interface PersonnelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}