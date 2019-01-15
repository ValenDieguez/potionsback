package com.mvpigs.potionsback.Classes;

import java.sql.Date;

public class User {

    private String userName;
    private String userPass;
    private String userMail;
    private Date creationDate;
    private Date unsubscribeDate;
    private String avatar;


    public User(String userName, String userPass, String userMail) {
        this.userName = userName;
        this.userPass = userPass;
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
