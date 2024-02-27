package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.GradeService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    public static AuthService getInstance(){
        return instance;
    }
    Map<String, UserDto> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?");
        UserDto person  = new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .verifyPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .build();
        return null;
    }
    @Override
    public String login() {
        return null;
    }
    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        String usernameKey = util.createRandomUsername();
        for(int i = 0;i<5;i++) {
            map.put(usernameKey,
                    new UserBuilder()
                            .username(usernameKey)
                            .password("1")
                            .verifyPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미 값 추가";
    }
    @Override
    public UserDto findUser(String username) {
        UserDto user = new UserBuilder().build();
        return user;
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }
    public String count(){
        return users.size()+"";
    }
}
