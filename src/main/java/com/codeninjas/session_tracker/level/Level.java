package com.codeninjas.session_tracker.level;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Level {

    private final int id;
    private final int levelNumber;

    @Override
    public String toString() {
        return Integer.toString(levelNumber);
    }

}
