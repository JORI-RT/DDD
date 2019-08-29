package pension;

import java.util.List;


/**
 * 確定拠出年金の口座を作成するfactory
 */
public class AccountFactory {
    private AccountRepository accountRepository;
    public AccountFactory(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Contractor contractor, DealStrategy dealStrategy) {
        if (existAlready(contractor, accountRepository.findAll())) {
            throw new DuplicateAccountException();
        }
        Account account = new Account(dealStrategy, contractor);
        accountRepository.save(account);
        return account;
    }

    static boolean existAlready(Contractor contractor, List<Account> accounts) {
        return accounts.stream().anyMatch(a -> a.getContractor().equals(contractor));
    }
}
