package controller;

import model.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

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
        return userService.join(User.builder()
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
        return userService.login(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public User findUserById(Scanner sc) {
        return userService.findUserById(sc.next());
    }

    public String updatePassword(Scanner sc) {
        return userService.updatePassword(User.builder()
                .username(sc.next()).password(sc.next()).build());
    }


    public String deleteUser(Scanner sc) {
        return userService.deleteUser(sc.next());
    }


    public Map<String, User> getUserMap() {
        System.out.println("전체 목록 출력");
        return userService.getUserMap();
    }

    public List<User> findUsersByName(Scanner sc) {
        return userService.findUsersByName(sc.next());
    }


    public List<User> findUsersByJob(Scanner sc) {
        return userService.findUsersByJob(sc.next());
    }

    public String addUsers() {
        return userService.addUsers();
    }

    public String count() {
        return userService.count();
    }
}