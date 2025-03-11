package com.codeninjas.session_tracker.belt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class Belt {

    @Getter
    private final int id;

    @Getter
    private final String beltColor;

    @Override
    public String toString() {
        return beltColor;
    }

}
