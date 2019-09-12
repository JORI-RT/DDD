package scrum.transparent;

import static scrum.transparent.Status.*;

public class Task implements Transparency{
    private Status status;
    public Task() {
        this.status = TODO;
    }

    /**
     * タスクの進捗状況を表す
     */
    @Override
    public void show() {

    }
}

enum Status{
    TODO,
    DOING,
    DONE,
    PENDING
}
