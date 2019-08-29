package pension;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 国庫に編入できるアカウントがないか調べるサービス
 */
public class KillService {

    private AccountRepository accountRepository;

    public KillService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * 国庫に編入するメソッド
     */
    public void kill() {
        List<Account> shouldKillAccount =
                accountRepository.findAll()
                .stream().filter(ac -> ac.afterSixMonth())
                        .collect(Collectors.toList());
        accountRepository.balkDelete(shouldKillAccount);
    }
}
