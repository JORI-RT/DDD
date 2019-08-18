package pcb;


import java.util.HashSet;
import java.util.Set;

abstract class AbstractNet {
    private Set rules = new HashSet();

    public void assignRule(LayoutRule rule) {
        rules.add(rule);
    }

    public Set assignedRules() {
        return rules;
    }
}

/**
 * チップについているピンが他のピンにつながっている様子を表す
 */
class Net extends AbstractNet {
    private String name;
    private Bus bus;

    public Net(String name) {
        this.name = name;
    }

    void setBus(Bus bus) {
        this.bus = bus;
    }

    public Set assignedRules() {
        Set result = new HashSet();
        result.addAll(super.assignedRules());
        result.addAll(bus.assignedRules());
        return result;
    }
}

/**
 * 同じルールを共有する論理的なネットの集合
 */
class Bus extends AbstractNet {
    Set<Net> nets = new HashSet<>();
    private String name;

    public Bus(String name) {
        this.name = name;
    }

    public void add(Net net) {
        net.setBus(this);
        nets.add(net);
    }
}

