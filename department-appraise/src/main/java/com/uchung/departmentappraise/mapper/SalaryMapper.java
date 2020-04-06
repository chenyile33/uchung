package com.uchung.departmentappraise.mapper;

import com.uchung.departmentappraise.model.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    List<Salary> selectAll();

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}