package view;

import model.User;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?, 직업?");
        User member = User.builder()
                .username(util.createRandomUsername())
                .password(sc.next())
                .verifyPassword(sc.next())
                .name(util.createRandomName())
                .socialSecurityNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();


        System.out.println(member.toString());
    }
}
