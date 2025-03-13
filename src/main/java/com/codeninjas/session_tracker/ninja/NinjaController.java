package com.codeninjas.session_tracker.ninja;

import com.codeninjas.session_tracker.belt.Belt;
import com.codeninjas.session_tracker.level.Level;
import com.codeninjas.session_tracker.sensei.Sensei;
import com.codeninjas.session_tracker.task.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("ninja")
public class NinjaController {

    @ModelAttribute(name = "ninjas")
    public List<Ninja> ninjas(Model model) {

        long currentTime = System.currentTimeMillis();
        log.info("current time {}", currentTime);
        return Arrays.asList(
                new Ninja("Bailey",
                        "Smith",
                        new Belt(3, "Orange"),
                        new Level(2, 2),
                        new Task(2, "Build 2"),
                        new Date(currentTime),
                        new Sensei(2, "John", "Gaviria")
                ),
                new Ninja("Tatiana",
                        "Marquez",
                        new Belt(1, "White"),
                        new Level(1, 1),
                        new Task(1, "Build 1"),
                        new Date(currentTime),
                        new Sensei(1, "Alexander", "Gutierrez")
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

    @ModelAttribute(name = "levels")
    public List<Level> levels() {
        return Arrays.asList(
                new Level(1, 1),
                new Level(2, 2),
                new Level(3, 3),
                new Level(4, 4)
        );
    }

    @ModelAttribute(name = "tasks")
    public List<Task> tasks() {
        return Arrays.asList(
                new Task(1, "Build 1"),
                new Task(2, "Build 2"),
                new Task(3, "Build 3"),
                new Task(4, "Quest")
        );
    }

    @ModelAttribute(name = "senseis")
    public List<Sensei> senseis() {
        return Arrays.asList(
                new Sensei(1, "Alexander", "Gutierrez"),
                new Sensei(2, "John", "Gaviria")
        );
    }

    @GetMapping("/list")
    public String getNinjaList() {
        return "ninja/list";
    }

    // TODO converters need to be implemented to convert String values from the form in list.html to Belt, Task, Level...
    @PostMapping("/list")
    public String saveNinja(Ninja ninja) {
        log.info("Ninja {}", ninja);
        return "redirect:/ninja/list";
    }
}