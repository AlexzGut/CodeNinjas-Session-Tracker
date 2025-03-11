package com.codeninjas.session_tracker.sensei;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Sensei {

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
