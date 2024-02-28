package controller;

import builder.UserBuilder;
import model.UserDto;
import service.UserService;
import service.UtilService;
import serviceImpl.UserServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {

    UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }


    public String join(Scanner sc) {
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?");
        return userService.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .verifyPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .build());
    }


    public String login(Scanner sc) {
        System.out.println("ID, 비밀번호 입력: ");
        return userService.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }


    public UserDto findUserById() {
        return null;
    }


    public String updatePassword() {
        return null;
    }


    public String deleteUser() {
        return null;
    }


    public Map<String, UserDto> getUserMap() {
        System.out.println("전체 목록 출력");
        return userService.getUserMap();
    }


    public List<UserDto> findUsersByName() {
        return null;
    }


    public List<UserDto> findUsersByJob() {
        return null;
    }

    public String addUsers() {
        return userService.addUsers();
    }

    public String count() {
       return userService.count();
    }
}
