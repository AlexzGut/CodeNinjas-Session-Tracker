package com.codeninjas.session_tracker.level;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class Level {

    @Getter
    private final int id;

    @Getter
    private final int levelNumber;

    @Override
    public String toString() {
        return Integer.toString(levelNumber);
    }

}
