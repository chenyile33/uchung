package com.uchung.departmentappraise.controller;

import com.uchung.departmentappraise.mapper.OtherMapper;
import com.uchung.departmentappraise.model.Other;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class OtherController {
    @Autowired
    OtherMapper otherMapper;

    @GetMapping("/other/{id}")
    public Other getSalary(@PathVariable int id) {
        return otherMapper.selectByPrimaryKey(id);
    }
}