package ch6_lifecycle;

import java.util.UUID;

public class Car {
    /**
     * 車体番号
     */
    private UUID carId;
    /**
     * 0:右前
     * 1:左前
     * 2:右後ろ
     * 3:左後ろ
     */
    private Tire[] tires = new Tire[4];

    public Car() {
        carId = UUID.randomUUID();
        tires[0] = new Tire(0);
        tires[1] = new Tire(1);
        tires[2] = new Tire(2);
        tires[3] = new Tire(3);
    }

    public int tireAmount() {
        return tires.length;
    }

    public void rotate(int a, int b) {

    }
}
