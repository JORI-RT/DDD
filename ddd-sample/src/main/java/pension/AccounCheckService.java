package pension;

import java.util.List;

/**
 * サービスなのに状態を保っているのは、永続化層を作成するのが面倒だったため
 */
public class AccounCheckService {

    static boolean existAlready(Contractor contractor, List<Account> accounts) {
        return accounts.stream().anyMatch(a -> a.getContractor().equals(contractor));
    }
}
