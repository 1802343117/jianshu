package com.jianshu.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class User {
    private Integer id;
    private String account;
    private String password;
    private String avatar;
    private String nickname;
    private LocalDate joinDate;
    private String description;
}
