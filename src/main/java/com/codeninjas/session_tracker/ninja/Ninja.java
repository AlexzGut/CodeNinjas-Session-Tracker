package com.codeninjas.session_tracker.ninja;

import com.codeninjas.session_tracker.belt.Belt;
import com.codeninjas.session_tracker.level.Level;
import com.codeninjas.session_tracker.sensei.Sensei;
import com.codeninjas.session_tracker.task.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ninja {

    private String firstName;
    private String lastName;
    private Belt beltColor;
    private Level levelNumber;
    private Task taskName;
    private Date updatedOn;
    private Sensei sensei;

}
