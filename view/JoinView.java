package view;

import builder.UserBuilder;
import model.UserDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?");
        UserDto member = new UserBuilder().userName(sc.next())
                .password(sc.next())
                .verifyPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .build();


        System.out.println(member.toString());
    }
}
