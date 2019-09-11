package scrum.transparent;

import scrum.transparent.PBI;
import scrum.transparent.Transparency;

import java.util.List;

public class SBL implements Transparency {
    private List<PBI> pbis;

    /**
     * スプリントで実現されるべき価値を可視化する
     */
    @Override
    public void show() {
        System.out.println(pbis);
    }
}
