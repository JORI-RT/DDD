package ch9_specification.construct;

import java.util.Collection;
import java.util.Set;

public class Container {
    private Set<Drum> contents;
    private Set<ContainerFeature> containerFeatureSet;
    public Collection<ContainerFeature> getFeatures() {
        return this.containerFeatureSet;
    }

    boolean isSafelyPacked() {

        return contents.stream()
                .allMatch(drum -> drum.getContainerSpecification().isStatisfiedBy(this));
    }
}
