package pension;

/**
 * 確定拠出年金で売買される金融商品を表現
 */
public abstract class Stock {
    public int getPrice() {
        return price;
    }
    int price;
}

class CountryDebt extends Stock{
    public CountryDebt(int price) {
        this.price = price;
    }
}

class HightRiskStock extends Stock{
    public HightRiskStock(int price) {
        if(Math.random() > 0.9) {
            price *= 20;
        } else {
            price = 0;
        }
        this.price = price;
    }
}
