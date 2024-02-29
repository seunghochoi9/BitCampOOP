package serviceImpl;

import model.AccountDto;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();

    List<AccountDto> accounts;
    private AccountServiceImpl(){
        this.accounts = new ArrayList<>();
    }
    public static AccountService getinstance() {
        return instance;
    }

    @Override
    public String createAccount(AccountDto account) {
        return "계좌생성 완료";
    }

    @Override
    public String deposit(AccountDto account) {
        return "입금 완료";
    }

    @Override
    public String withdraw(AccountDto account) {
        return "인출 완료";
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }

    @Override
    public String getBalance(AccountDto account) {
        return null;
    }


    @Override
    public String cancelAccount(String accountNumber) {
        return "계좌삭제 완료";
    }
}
