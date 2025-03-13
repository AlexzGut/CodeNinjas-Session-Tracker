package com.codeninjas.session_tracker.level;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

@Component
public class LevelByIdConverter implements Converter<String, Level> {

    private Map<String, Level> levelMap = new HashMap<>();

    public LevelByIdConverter() {
        levelMap.put("1", new Level(1,1));
        levelMap.put("2", new Level(1,2));
        levelMap.put("3", new Level(1,3));
        levelMap.put("4", new Level(1,4));
    }

    @Override
    public Level convert(String id) {
        return levelMap.get(id);
    }
}
