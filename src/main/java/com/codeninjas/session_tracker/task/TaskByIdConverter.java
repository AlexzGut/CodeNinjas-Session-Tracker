package com.codeninjas.session_tracker.task;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TaskByIdConverter implements Converter<String, Task> {

    private Map<String, Task> taskMap = new HashMap<>();

    public TaskByIdConverter() {
        taskMap.put("1", new Task(1, "Build 1"));
        taskMap.put("2", new Task(2, "Build 2"));
        taskMap.put("3", new Task(3, "Build 3"));
        taskMap.put("4", new Task(4, "Quest"));
    }

    @Override
    public Task convert(String id) {
        return taskMap.get(id);
    }

}
