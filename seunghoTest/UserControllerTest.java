package seunghoTest;

import builder.UserBuilder;
import model.UserDto;
import seunghoTest.UserServiceTest;
import seunghoTest.UserServiceImplTest;

import java.util.Map;
import java.util.Scanner;

public class UserControllerTest {
    UserServiceTest ust;

    public UserControllerTest() {
        this.ust = new UserServiceImplTest();
    }

    public String addUser() {
        return ust.addUsers();
    }

    public String userCount() {
        return ust.userCount();
    }

    public String join(Scanner sc) {
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?");
        return ust.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .verifyPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next()).phoneNumber(sc.next()).address(sc.next()).build());
    }

    public Map<String, UserDto> getUsersMap() {
        return ust.getUsersMap();
    }

    public String login(Scanner sc) {
        System.out.println("로그인할 ID, 비밀번호 입력: ");
        return ust.login(new UserBuilder().username(sc.next()).password(sc.next()).build());
    }
}
