package scrum.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * チームの生産を妨げる障害のリストを表す
 */
public class InpedimentList implements Transparency {
    /**
     * 都度作るものではないものを表現するためにstaticにしている
     */
    private static List<Impediment> impedimentList = new ArrayList<>();
    static void add(Impediment impediment) {
        impedimentList.add(impediment);
    }

    /**
     * チームが直面している障害のリストを優先順位をつけて可視化する
     */
    @Override
    public void show() {
        System.out.println(impedimentList);
    }
}
