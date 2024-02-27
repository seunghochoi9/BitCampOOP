package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {
    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {

        return auth.join(sc);
    }


    public String login() {

        return auth.login();
    }


    public String addUsers() {
        auth.addUsers();
        return "";
    }


    public UserDto findUser(String username) {
        auth.findUser(username);
        return null;
    }

    public Map<String, UserDto> getUserMap() {
        return auth.getUserMap();
    }

    public String count() {
        System.out.println("회원수 : " + auth.count() + " 명");
        return auth.count();
    }

}
