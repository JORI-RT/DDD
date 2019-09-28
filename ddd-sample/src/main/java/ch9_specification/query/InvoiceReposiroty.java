package ch9_specification.query;

import ch9_specification.verification.Invoice;
import ch9_specification.verification.InvoiceSpecification;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class InvoiceReposiroty {
    /**
     * 仕様を満たす請求書を選択する
     * @param spec　請求書仕様
     * @return 仕様を満たす請求書のセット
     */
    public Set<Invoice>  selectStatisfying(InvoiceSpecification spec) {
        // 最適化のために、SQLで実装しても良い
        Set<Invoice> all = findAll();

        return all.stream()
                .filter(candidate -> spec.isSatisifiedBy(candidate))
                .collect(Collectors.toSet());
    }

    public Set<Invoice> findAll() {
        return null;
    }


    /**
     * SQLバージョン
     * この設計は、テーブル構造がドメイン層（Specification）に漏れ出している
     * FWでカプセル化できるなら、した方が良い（JPAはできる、mybatisは不明）
     */
    public Set<Invoice>  selectStatisfying2(InvoiceSpecification spec) {
        String sql = spec.asSql();
        return QueryService.executeQuery(sql);
    }

    private static class QueryService {
        public static Set<Invoice> executeQuery(String sql) {
            return null;
        }
    }
}
