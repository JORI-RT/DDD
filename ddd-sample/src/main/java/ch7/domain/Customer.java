package ch7.domain;

/**
 * Entity
 * Aggregate
 * Customerが貨物に対する参照を持っていると過去に関わった
 * 貨物を全て持たなければならないのでやらない
 *
 */
public class Customer {


    private int customerId;

    /**
     * idは手入力された物
     * @param id
     */
    public Customer(int id) {
        this.customerId = id;
    }

}
