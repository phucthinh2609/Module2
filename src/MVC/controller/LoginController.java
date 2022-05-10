package MVC.controller;

import MVC.model.LoginModel;
import MVC.view.LoginView;

public class LoginController {
    private LoginView view;

    public LoginController(LoginView view){
        this.view = view;
    }

    public boolean check(LoginModel user){
        if((user.getUser().equals("admin"))&&(user.getPass().equals("123")))
            return true;
        else
            return false;
    }

    public void login(){
        while (true){
            LoginModel user = view.getInfo();
            if(check(user)){
                System.out.println("Login successfully");
                break;
            }
            else
                System.out.println("Wrong user and pass");
        }
    }

}

