package ch7.domain;

import java.util.List;

/**
 * Entity
 * 一意性は独自の同一性は持っておらず、Cargoから借りてくる
 */
public class DeliveryHistory {
    // 双方向参照
    Cargo cargo;
    // FIXME 循環参照、脆弱な実装、後ほど置き換えられるらしい
    List<HandlingEvent> handlingEventList;
}
