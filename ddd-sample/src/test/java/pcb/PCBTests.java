package pcb;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static pcb.RuleType.MIN_WITH;

class PCBTests {
    @Test
    void initialization() {
        File aFile = null;
        Collection<Net> nets = NetListImportService.read(aFile);
        Collection<Bus> buses = InferredBusFactory.groupIntoBuses(nets);
        BusRepository.addAll(buses);
    }

    @Test
    void assignRuleToBusAndBiographyNet() {
        Net a0 = new Net("a0");
        Net a1 = new Net("a1");
        Bus a = new Bus("a");

        a.add(a0);
        a.add(a1);

        NetRule minWith4 = NetRule.createRule(MIN_WITH, 4);
        a.assignRule(minWith4);

        assertThat(a0.assignedRules()).contains(minWith4);
        assertThat(minWith4).isEqualTo(a0.getRule(MIN_WITH));
        assertThat(minWith4).isEqualTo(a1.getRule(MIN_WITH));
    }
}

