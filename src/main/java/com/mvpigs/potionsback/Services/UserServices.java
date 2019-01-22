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

public void createUser(String name, String pass, String mail){
        User newUser = new User(name,pass,mail);

}

public void setAvatar(User user, String avatarUrl){
        user.setUserAvatar(avatarUrl);
}

public void setId(User user, String userId){
        user.setUserId(userId);
}

public void loginUser(String userName, String userPass){

}


// todo acabar el getter cuando este lo de la bd
public void getUser(String userId){

}

// setname, setpass, unsubscribeUser



}
