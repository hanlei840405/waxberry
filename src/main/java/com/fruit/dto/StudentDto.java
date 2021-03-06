package com.fruit.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hanlei6 on 16-12-16.
 */
@Getter
@Setter
public class StudentDto implements Serializable {
    private static final long serialVersionUID = -1753866839710890272L;
    private String nick;
    private String realName;
    private String photo;
    private int age;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String cellphone;
    private String email;
    private String weChat;
    private String weiBo;
    private String qq;
    private String province;
    private String city;
    private String district;
    private String address;
    private String school;
    private String grade;

    // 账户信息
    private String username;
    private String password;
}
