package scrum.transparent;

import java.util.List;

public class InpedimentList implements Transparency {
    private List<Impediment> impediment;
    /**
     * チームが直面している障害のリストを優先順位をつけて可視化する
     */
    @Override
    public void show() {
        System.out.println(impediment);
    }
}
