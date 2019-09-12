package scrum.transparent;

import scrum.transparent.Transparency;

import java.util.List;

public class PBI implements Transparency {

    PBIStatus status;
    List<Task> tasks;
    public PBI(List<Task> tasks) {
        this.status = PBIStatus.UNDONE;
        this.tasks = tasks;
    }
    /**
     * このPBIで実現される価値を表示する
     */
    @Override
    public void show() {

    }
}

enum PBIStatus {
    UNDONE,
    DONE
}