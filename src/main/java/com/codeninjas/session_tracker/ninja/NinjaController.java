package com.codeninjas.session_tracker.ninja;

import com.codeninjas.session_tracker.belt.Belt;
import com.codeninjas.session_tracker.level.Level;
import com.codeninjas.session_tracker.sensei.Sensei;
import com.codeninjas.session_tracker.task.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("ninja")
public class NinjaController {

    @ModelAttribute(name = "ninjas")
    public List<Ninja> ninjas() {
        return Arrays.asList(
                new Ninja("Alexander",
                        "Gutierrez",
                        new Belt(1, "Orange"),
                        new Level(1, 1),
                        new Task(1, "Build 1"),
                        new Sensei(1, "John", "Gaviria")
                )
        );
    }

    @ModelAttribute(name = "belts")
    public List<Belt> belts() {
        return Arrays.asList(
                new Belt(1, "White"),
                new Belt(2, "Yellow"),
                new Belt(3, "Orange"),
                new Belt(4, "Green")
        );
    }

    @GetMapping("/list")
    public String getNinjaList() {
        return "ninja/list";
    }

}