package pension;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 確定拠出年金口座
 */
public class Account {

    private UUID accountNo;
    private DealStrategy dealStrategy;// YAGNI的には不要だが、かっこいいので残す
    private Contractor contractor;                    // 契約者
    private List<Stock> stocks = new ArrayList<>();   // 口座に入っている投資商品
    private LocalDate lastDealDate = LocalDate.now(); // 最終取引日

    Account(Contractor contractor) {
        this.accountNo = UUID.randomUUID();
        this.contractor = contractor;
    }

    public Contractor getContractor() {
        return contractor;
    }

    // 月一で走るメソッド、サービスとかにして外だしするのが正しいかも
    public void buy() {
        stocks.addAll(dealStrategy.buy());
        lastDealDate = LocalDate.now();
    }

    // ６ヶ月取引がなかったら国庫に返納されることを表現する
    // これもこのクラスが表現すべきではないかも
    public void KillAccount() {
        if (afterSixMonth()) {
            // 国庫に返納
            stocks = null;
        }
    }

    // TODO ６ヶ月ごを表現
    private boolean afterSixMonth() {
        return lastDealDate.toEpochDay() > 11;
    }
}

