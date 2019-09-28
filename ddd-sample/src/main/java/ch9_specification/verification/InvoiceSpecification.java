package ch9_specification.verification;

public interface InvoiceSpecification {
    boolean isSatisifiedBy(Invoice candidate);

    /**
     * 仕様を満たした状態のInoviceが取得できるSQLを定義
     * @return
     */
    String asSql();
}
