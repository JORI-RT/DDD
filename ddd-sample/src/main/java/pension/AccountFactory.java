package pension;

import static pension.AccounCheckService.existAlready;

public class AccountFactory {
    public AccountFactory(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    private AccountRepository accountRepository;

    public Account createAccount(Contractor contractor) {
        if (existAlready(contractor, accountRepository.findAll())) {
            throw new DuplicateAccountException();
        }
        Account account = new Account(contractor);
        accountRepository.save(account);
        return account;
    }
}
