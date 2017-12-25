package com.springboot.controller;

import com.springboot.entity.SysUser;
import com.springboot.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/hello")
    public String hello(){
        SysUser user= sysUserMapper.findByUserId("04c0870933f54d44bdca7ea61910b9b9");
        return user.toString();
    }
}
