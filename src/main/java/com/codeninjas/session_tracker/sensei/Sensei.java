package com.codeninjas.session_tracker.sensei;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class Sensei {

    @Getter
    private int id;

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
