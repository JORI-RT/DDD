package ch9_specification.construct;

import java.util.Collection;
import java.util.Set;

public class Container {
    private double capacity;
    private Set<Drum> contents;
    private Set<ContainerFeature> containerFeatureSet;

    public Collection<ContainerFeature> getFeatures() {
        return this.containerFeatureSet;
    }

    /**
     * コンテナにドラム缶を入れるスペースがあるか
     * @param aDrum ドラム缶
     * @return 空間があればtrue
     */
    private boolean hasSpaceFor(Drum aDrum) {
        return remainingSpace() >= aDrum.getSize();
    }

    /**
     * 空いている空間
     * @return 残りの空間の大きさ
     */
    private double remainingSpace() {
        Double currentAmount = contents.stream()
                .map(drum -> drum.getSize())
                .reduce(0.0, (s1, s2) -> s1 + s2);
        return capacity - currentAmount;
    }

    /**
     * あるドラム缶が収容可能かどうか
     * @param aDrum 残りの空間の大きさ
     * @return 収容可能であればtrue
     */
    public boolean canAccommodate(Drum aDrum) {
        return hasSpaceFor(aDrum) &&
                aDrum.getContainerSpecification().isStatisfiedBy(this);
    }

    boolean isSafelyPacked() {

        return contents.stream()
                .allMatch(drum -> drum.getContainerSpecification().isStatisfiedBy(this));
    }

    public void add(Drum drum) {
        contents.add(drum);
    }
}
