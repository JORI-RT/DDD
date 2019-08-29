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

    Account(DealStrategy dealStrategy, Contractor contractor) {
        this.dealStrategy = dealStrategy;
        this.accountNo = UUID.randomUUID();
        this.contractor = contractor;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public int getCurrentValue() {
        // TODO もっといい書き方アリそう、直接reduceの仕方がわからんかった
        return stocks.stream().map(s -> s.getPrice()).reduce(0, (s1, s2) -> s1 + s2);
    }

    /**
     * 月に一回、決められたルールに基づいて取引を行う
     */
    public void dealPerMonth() {
        stocks.addAll(dealStrategy.buy());
        lastDealDate = LocalDate.now();
    }

    public boolean afterSixMonth() {
        return lastDealDate.toEpochDay() > 11;
    }
}

