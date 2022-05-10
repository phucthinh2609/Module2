package MVC.view;

import MVC.model.LoginModel;

import java.util.Scanner;

public class LoginView {
    Scanner input = new Scanner(System.in);

    public void showMessage(String msg){
        System.out.println(msg);
    }

    public LoginModel getInfo(){
        System.out.println("____LOGIN____");
        System.out.println();

        LoginModel user = new LoginModel();
        System.out.println("User: ");
        user.setUser(input.nextLine());
        System.out.println("Pass: ");
        user.setUser(input.nextLine());

        return user;
    }

}
