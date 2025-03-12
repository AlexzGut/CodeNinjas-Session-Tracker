package com.codeninjas.session_tracker.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class Task {

    @Getter
    private final int id;

    @Getter
    private final String taskName;

    @Override
    public String toString() {
        return taskName;
    }

}
