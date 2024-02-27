package controller;

import model.UserDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    public void addUsers(){
        AuthServiceImpl.getInstance().addUsers();
    }
//    private Map<String, UserDto> users;
//
//    public UserController() {
//        this.users = new HashMap<>();
//    }
//
//    public String addUsers() {
//        UserService auth = UserServiceImpl.getInstance();
//        users = auth.addUsers();
//    }
//
//    public void findUser(String username) {
//        System.out.println(users.get(username));
//    }
//
}
