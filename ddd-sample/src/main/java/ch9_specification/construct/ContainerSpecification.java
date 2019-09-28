package ch9_specification.construct;

public class ContainerSpecification {
    private ContainerFeature requiredFeature;

    public ContainerSpecification(ContainerFeature required) {
        this.requiredFeature = required;
    }

    /**
     * 受け取ったコンテナが仕様を満たすかどうか判定する
     * @param aContainer 判定対象のコンテナ
     * @return 仕様を満たせばtrue
     */
    boolean isStatisfiedBy(Container aContainer) {
        return aContainer.getFeatures().contains(requiredFeature);
    }
}
