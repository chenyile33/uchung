package com.uchung.departmentappraise.controller;

import com.uchung.departmentappraise.mapper.SalaryMapper;
import com.uchung.departmentappraise.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salary")
public class SalaryController {
    @Autowired
    SalaryMapper salaryMapper;

    @GetMapping
    public List<Salary> selectAll(){
        return salaryMapper.selectAll();
    }

    @GetMapping("/{id}")
    public Salary selectByPrimaryKey(@PathVariable Integer id){
        return salaryMapper.selectByPrimaryKey(id);
    }

    @PostMapping
    public Integer insertSelective(Salary salary){
        return salaryMapper.insertSelective(salary);
    }

    @DeleteMapping("/{id}")
    public Integer a(@PathVariable Integer id){
        return salaryMapper.deleteByPrimaryKey(id);
    }





}
