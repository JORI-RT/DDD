package scrum.transparent;

import scrum.transparent.PBI;
import scrum.transparent.Transparency;

import java.util.List;

public class PBL implements Transparency {
    private List<PBI> PBIs;
    /**
     * プロダクトの実現されるべき価値と実現された価値を
     * 可視化する
     */
    @Override
    public void show() {
        System.out.println(PBIs);
    }
}
