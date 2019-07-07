package it;

import it.helpers.CommonHelper;
import it.helpers.DashBoardHelper;
import it.helpers.LoginHelper;

public class App {
     public LoginHelper login;
     public DashBoardHelper dashBoard;
     public  CommonHelper common;

    public App() {
        login= new LoginHelper();
        dashBoard = new DashBoardHelper();
        common = new CommonHelper();
    }
}
