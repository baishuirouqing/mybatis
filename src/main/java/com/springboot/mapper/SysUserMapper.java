package com.springboot.mapper;

import com.springboot.entity.SysUser;


//@Component(value = "sysUserMapper")
public interface SysUserMapper {

    SysUser findByUserId(String userId);

}
