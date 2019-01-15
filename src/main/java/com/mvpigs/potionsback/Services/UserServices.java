package com.mvpigs.potionsback.Services;

import com.mvpigs.potionsback.Classes.User;

public class UserServices {

    private static UserServices userServices;

    public  static UserServices getConfigurador() {

        if (userServices==null) {

            userServices=new UserServices();
        }
        return userServices;
    }



}
