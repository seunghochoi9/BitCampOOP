package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();

    List<Account> accounts;
    private AccountServiceImpl(){
        this.accounts = new ArrayList<>();
    }
    public static AccountService getinstance() {
        return instance;
    }

    @Override
    public String createAccount(Account account) {
        accounts.add(null);
        return "계좌생성 완료";
    }

    @Override
    public String deposit(Account account) {
        return "입금 완료";
    }

    @Override
    public String withdraw(Account account) {
        return "인출 완료";
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public String getBalance(Account account) {
        return null;
    }


    @Override
    public String cancelAccount(String accountNumber) {
        return "계좌삭제 완료";
    }
}