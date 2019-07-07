package it.helpers;

import it.Entity.User;
import it.Entity.UserFactory;
import it.pages.LoginPage;

public class LoginHelper extends LoginPage {
    public void loginValidUser() {
        User user = UserFactory.getValidUser();
        login(user.getLogin(), user.getPass());

    }
    public void loginUser(User user){
        log.info(String.format("Login user name - %s, password -%s",user.getLogin(), user.getPass()));

        login(user.getLogin(), user.getPass());
        }
    }


