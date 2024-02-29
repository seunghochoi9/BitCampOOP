package seunghoTest;

import builder.UserBuilder;
import model.UserDto;

import java.util.Map;
import java.util.Scanner;

public class TestUserController {
    TestUserService us;

    public TestUserController() {
        this.us = new TestUserServiceImpl();
    }

    public String addUser() {
        return us.addUsers();
    }

    public String userCount() {
        return us.userCount();
    }

    public String join(Scanner sc) {
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?");
        return us.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .verifyPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next()).phoneNumber(sc.next()).address(sc.next()).build());
    }

    public Map<String, UserDto> getUsersMap() {
        return us.getUsersMap();
    }

    public String login(Scanner sc) {
        System.out.println("로그인할 ID, 비밀번호 입력: ");
        return us.login(new UserBuilder().username(sc.next()).password(sc.next()).build());
    }

    public UserDto findById(Scanner sc) {
        return us.findById(sc.next());
    }

    public String changePassword(Scanner sc) {
        return us.changePassword(sc.next());
    }

    public boolean del() {
    }

    public boolean findByName() {
    }

    public boolean findByJob() {
    }
}
