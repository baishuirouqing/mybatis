package com.springboot.entity;

import com.springboot.enums.SexEnum;
import lombok.Data;
@Data
public class SysUser {
	private String userId;
    private String nickname;
    private String account;
    private String password;
    private String mobile;
    private String email;
    private String name;
    private Integer age;
    private SexEnum sex;
}
