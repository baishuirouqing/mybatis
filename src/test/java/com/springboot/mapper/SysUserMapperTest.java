package com.springboot.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.entity.SysUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void findByUserId() throws Exception {
        SysUser user= sysUserMapper.findByUserId("04c0870933f54d44bdca7ea61910b9b9");
        Assert.assertNotNull(user);
        System.out.print(sysUserMapper);
    }



}