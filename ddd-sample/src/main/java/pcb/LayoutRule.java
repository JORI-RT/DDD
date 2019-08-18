package pcb;

public abstract class LayoutRule {
}

class NetRule extends LayoutRule {
    public static NetRule createRule(RuleType ruleType, int num) {
        return null;
    }
}

enum RuleType {
    MIN_WITH,
    MAX_VIAS
}