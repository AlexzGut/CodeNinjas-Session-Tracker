package com.codeninjas.session_tracker.task;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Task {

    private final int id;
    private final String taskName;

    @Override
    public String toString() {
        return taskName;
    }

}
