package seunghoTest;

import model.UserDto;

import java.util.Map;
import java.util.Scanner;

public class TestUserView {
    public static void main(Scanner sc) {
        TestUserController uct = new TestUserController();
        uct.addUser();
        System.out.println("임의랜덤 가입자: "+uct.addUser());
        while (true) {
            System.out.println("[관리자메뉴] 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("1-회원가입");
                    System.out.println("회원가입 결과: "+uct.join(sc));
                    break;
                case "2":
                    System.out.println("2-로그인");
                    System.out.println(uct.login(sc));
                    break;
                case "3":
                    System.out.println("3-ID검색");
                    System.out.println(uct.findById(sc));
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    System.out.println(uct.changePassword(sc));
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    System.out.println(uct.del());
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    Map<String, UserDto> userMap = uct.getUsersMap();
                    userMap.forEach((k, v) -> {
                        System.out.printf("ID: %s / 회원정보: %s",k,v);
                    });
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    System.out.println(uct.findByName());
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    System.out.println(uct.findByJob());
                    break;
                case "9":
                    System.out.println("9-회원수");
                    System.out.println("회원수: "+uct.userCount());
                    break;

            }
        }
    }
}
