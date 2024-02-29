package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {

    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getinstance();
    }

    public String createAccount(Scanner sc) {
        return accountService.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        return accountService.deposit(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner sc) {
        return accountService.withdraw(new AccountBuilder()
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
        return accountService.getBalance(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }
}
