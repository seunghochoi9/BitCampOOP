package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AccountController {

    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getinstance();
    }

    public String createAccount(Scanner sc) {
        return accountService.createAccount(Account.builder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        return accountService.deposit(Account.builder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .build());
    }

    public String withdraw(Scanner sc) {
        return accountService.withdraw(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }


    public String cancelAccount(Scanner sc) {
        return accountService.cancelAccount(sc.next());
    }

    public String getBalance(Scanner sc) {
        return accountService.getBalance(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }
}