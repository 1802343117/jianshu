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
    private String address;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account){
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(LocalDate joinDate){
        this.joinDate = joinDate;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
