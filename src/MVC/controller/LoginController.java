package MVC.controller;

import MVC.model.LoginModel;
import MVC.view.LoginView;

public class LoginController {
    private LoginView view;

    public LoginController(LoginModel view){
        this.view = view;
    }
}

