package ch7.domain;

import java.util.UUID;

/**
 * Entity
 * Aggregate
 */
public class Cargo {
    private UUID cargoId;

    // 双方向参照
    DeliveryHistory deliveryHistory;

    // value objecなので参照はこのむき
    DeliverySpecification deliverySpecification;

    public Cargo(UUID cargoId) {
        this.cargoId = cargoId;
    }
}
