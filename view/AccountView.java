package view;

import controller.AccountController;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        String msg = "";
        while (true) {
            System.out.println("[AccountC] 0-Exit\n " +
                    "1-Create\n " +
                    "2-Deposit\n " +
                    "3-Withdraw\n " +
                    "4-Balance\n" +
                    "5-Delete\n ");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("계좌생성: 예금번호, 예금주");
                    msg = accountController.createAccount(sc);
                    System.out.println(msg);
                    break;
                case "2":
                    System.out.println("입금: 계좌번호, 금액");
                    msg = accountController.deposit(sc);
                    System.out.println(msg);
                    break;
                case "3":
                    System.out.println("인출: 계좌번호, 금액");
                    msg = accountController.withdraw(sc);
                    System.out.println(msg);
                    break;
                case "4":
                    System.out.println("잔액확인: 계좌번호");
                    System.out.println(accountController.getBalance(sc));
                    break;
                case "5":
                    System.out.println("계좌삭제: 계좌번호");
                    msg = accountController.cancelAccount(sc);
                    System.out.println(msg);
                    break;
            }
        }
    }
}
