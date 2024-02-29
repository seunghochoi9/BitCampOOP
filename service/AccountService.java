package service;

import model.AccountDto;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDto account);
    String deposit(AccountDto account);
    String withdraw(AccountDto account);
    List<AccountDto> getAccounts();
    String getBalance(AccountDto account);
    String cancelAccount(String accountNumber);
}
