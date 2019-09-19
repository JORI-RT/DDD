package ch7.domain;

/**
 * Entity
 * Aggregate
 * 貨物ID、完了時刻、タイプの組み合わせで一意
 *
 * TODO p170の意味が不明
 *
 * 集約にする理由
 * 競合の少ないトランザクションで作成する必要があるから
 *
 */

public class HandlingEvent {

    // この参照のむきは、モデリングの成果
    // モデルを単純化している
    CarrierMovement carrierMovement;

}
