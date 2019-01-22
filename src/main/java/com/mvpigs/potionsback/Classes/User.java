package com.mvpigs.potionsback.Classes;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Date;

@Entity
public class User {
    @Id
    private String userId;

    @Column
    private String userName;

    @Column
    private String userPass;

    @Column
    private String userMail;

    @Column
    private Date creationDate;

    @Column
    private Date unsubDate;

    @Column
    private String userAvatar;

    @Column
    private Roles userRole;


    public User(String userName, String userPass, String userMail) {
        this.userName = userName;
        this.userPass = userPass;
        this.userMail = userMail;
        this.userRole = Roles.NORMAL;
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

    public String getUserAvatar() {
        return userAvatar;
    }

    public Roles getUserRole() {
        return userRole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserAvatar(String avatar) {
        this.userAvatar = avatar;
    }
}
