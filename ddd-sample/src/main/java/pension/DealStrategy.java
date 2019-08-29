package pension;

import java.util.ArrayList;
import java.util.List;

/**
 * 確定拠出年金の運用ルールを表現
 */
interface DealStrategy {

    List<? extends Stock> buy();

    static DealStrategy create() {
       return new BasicStrategy();
    }
}

/**
 * 全部国債を買う戦略
 */
class BasicStrategy implements DealStrategy {
    @Override
    public List<? extends Stock> buy() {
        List<Stock> itDeal = new ArrayList<>();
        // 国債ってこんな感じ？
        CountryDebt countryDebt = new CountryDebt(10000);
        itDeal.add(countryDebt);
        return itDeal;
    }
}

/**
 * ハイリスクの株を買う戦略
 */
class HighRiskHighReturn implements DealStrategy {
    @Override
    public List<? extends Stock> buy() {
        List<Stock> itDeal = new ArrayList<>();
        HightRiskStock hightRiskStock = new HightRiskStock(10000);
        itDeal.add(hightRiskStock);
        return itDeal;
    }
}
