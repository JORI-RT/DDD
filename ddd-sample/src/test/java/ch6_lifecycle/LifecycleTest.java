package ch6_lifecycle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LifecycleTest {
    @DisplayName("" +
            "車ドメインの集約であるcarを生成する" +
            "不変条件：タイヤの数は４つ" +
            "")
    @Test
    void createAggregates() {
        Car car = CarFactory.create();
        assertThat(car.tireAmount()).isEqualTo(4);
    }
}
