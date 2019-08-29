package pension;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    List<Account> accounts = new ArrayList<>();

    public void save(Account account) {
        accounts.add(account);
    }

    public List<Account> findAll() {
        return accounts;
    }

}
